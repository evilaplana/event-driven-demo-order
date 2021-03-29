package com.tutorial.event.driven.order.service.impl;

import com.tutorial.event.driven.order.controller.model.input.OrderCreationRequestDto;
import com.tutorial.event.driven.order.controller.model.output.OrderStatusResponseDto;
import com.tutorial.event.driven.order.service.OrderManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderManagementServiceImpl implements OrderManagementService {

  @Override
  public OrderStatusResponseDto placeOrder(final OrderCreationRequestDto creationRequestDto) {
    return null;
  }
}
