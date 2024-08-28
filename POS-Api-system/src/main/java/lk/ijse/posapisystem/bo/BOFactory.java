package lk.ijse.posapisystem.bo;

import lk.ijse.posapisystem.bo.impl.CustomerBOImpl;
import lk.ijse.posapisystem.bo.impl.ItemBOImpl;
import lk.ijse.posapisystem.bo.impl.OrderBOImpl;

public class BOFactory {

    private static BOFactory boFactory;

    private BOFactory(){

    }

    public static BOFactory getBoFactory(){
        return boFactory == null? boFactory = new BOFactory() : boFactory;
    }

    public static BOFactory getBOFactory() {
        return getBoFactory();
    }


    public enum BOTypes{
        CUSTOMER,ITEM,ORDER
    }

    public SuperBO getBo(BOTypes types){
        switch (types){
            case CUSTOMER:
            return new CustomerBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case ORDER:
                return new OrderBOImpl();
            default:
                return null;
        }
    }
}
