package com.tutorial.event.driven.order.controller.model.output;

import com.tutorial.event.driven.order.service.enums.OrderStatus;
import lombok.Data;

import java.io.Serializable;

@Data
public class OrderStatusResponseDto implements Serializable {

  private static final long serialVersionUID = -3116232547076317979L;

  private Long orderId;
  private Long clientId;
  private OrderStatus orderStatus;
}
