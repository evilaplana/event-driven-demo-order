package com.tutorial.event.driven.order.stream.model.output;

import lombok.Data;

@Data
public class PlaceOrderMessageDto {

  private Long clientId;
  private Long orderId;
}
