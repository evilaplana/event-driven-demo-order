package com.tutorial.event.driven.order.service;

import com.tutorial.event.driven.order.controller.model.input.OrderCreationRequestDto;
import com.tutorial.event.driven.order.controller.model.output.OrderStatusResponseDto;

public interface OrderManagementService {

  OrderStatusResponseDto placeOrder(OrderCreationRequestDto creationRequestDto);
}
