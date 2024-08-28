package lk.ijse.posapisystem.bo.custom;

import lk.ijse.posapisystem.bo.SuperBO;
import lk.ijse.posapisystem.dto.OrderDTO;
import lk.ijse.posapisystem.dto.OrderDetailDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface OrderBO extends SuperBO {
    boolean placeOrder(OrderDTO orderDTO, List<OrderDetailDTO> orderDetailDTOS, Connection connection) throws SQLException;
}
