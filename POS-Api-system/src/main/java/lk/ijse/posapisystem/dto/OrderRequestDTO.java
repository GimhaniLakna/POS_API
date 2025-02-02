package lk.ijse.posapisystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRequestDTO implements Serializable {
    private OrderDTO orderDTO;
    private List<OrderDetailDTO> orderDetailDTOS;
}