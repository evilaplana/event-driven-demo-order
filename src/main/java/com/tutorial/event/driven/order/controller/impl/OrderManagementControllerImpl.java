package com.tutorial.event.driven.order.controller.impl;

import com.tutorial.event.driven.order.controller.OrderManagementController;
import com.tutorial.event.driven.order.controller.model.input.OrderCreationRequestDto;
import com.tutorial.event.driven.order.controller.model.output.OrderManagerResponse;
import com.tutorial.event.driven.order.controller.model.output.OrderStatusResponseDto;
import com.tutorial.event.driven.order.service.OrderManagementService;
import com.tutorial.event.driven.order.util.RestConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderManagementControllerImpl implements OrderManagementController {

  private final OrderManagementService orderManagementService;

  @Override
  public OrderManagerResponse<OrderStatusResponseDto> placeOrder(
      final OrderCreationRequestDto creationRequestDto) {
    return new OrderManagerResponse<>(
        RestConstants.OK_CODE,
        RestConstants.SUCCESS_MESSAGE,
        orderManagementService.placeOrder(creationRequestDto));
  }
}
