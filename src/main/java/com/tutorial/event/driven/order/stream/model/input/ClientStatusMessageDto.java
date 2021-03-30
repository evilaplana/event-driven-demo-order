package com.tutorial.event.driven.order.stream.model.input;

import lombok.Data;

@Data
public class ClientStatusMessageDto {

  private Integer orderId;
  private Integer clientId;
  private String clientStatus;
}
