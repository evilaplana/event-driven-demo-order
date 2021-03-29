package com.tutorial.event.driven.order.controller.model.input;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderCreationRequestDto implements Serializable {

  private static final long serialVersionUID = -3116232547076317979L;

  private Long clientId;
}
