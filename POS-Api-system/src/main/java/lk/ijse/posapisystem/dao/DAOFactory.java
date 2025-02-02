package lk.ijse.posapisystem.dao;

import lk.ijse.posapisystem.dao.impl.CustomerDAOImpl;
import lk.ijse.posapisystem.dao.impl.ItemDAOImpl;
import lk.ijse.posapisystem.dao.impl.OrderDAOImpl;
import lk.ijse.posapisystem.dao.impl.OrderDetailDAOImpl;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory() {

    }

    public static DAOFactory getDaoFactory() {
        return daoFactory == null ? daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DAOTypes {
        CUSTOMER, ITEM, ORDER, ORDER_DETAIL
    }

    public SuperDAO getDao(DAOTypes daoTypes) {
        switch (daoTypes) {
            case CUSTOMER:
                return new CustomerDAOImpl();
            case ITEM:
                return new ItemDAOImpl();
            case ORDER:
                return new OrderDAOImpl();
            case ORDER_DETAIL:
                return new OrderDetailDAOImpl();

            default:
                return null;

        }
    }
}
