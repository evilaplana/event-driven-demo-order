package com.tutorial.event.driven.order.stream.model.input;

import lombok.Data;

@Data
public class ClientStatusMessageDto {

  private Long clientId;
  private String clientStatus;
}
