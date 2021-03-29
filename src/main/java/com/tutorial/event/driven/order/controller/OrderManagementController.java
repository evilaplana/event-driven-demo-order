package com.tutorial.event.driven.order.controller;

import com.tutorial.event.driven.order.controller.model.input.OrderCreationRequestDto;
import com.tutorial.event.driven.order.controller.model.output.OrderManagerResponse;
import com.tutorial.event.driven.order.controller.model.output.OrderStatusResponseDto;
import com.tutorial.event.driven.order.util.RestConstants;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(RestConstants.APP_VERSION + RestConstants.ORDERS_RESOURCE)
public interface OrderManagementController {

  @PostMapping
  @ApiOperation("Retrieve all clients")
  OrderManagerResponse<OrderStatusResponseDto> placeOrder(
      @RequestBody OrderCreationRequestDto creationRequestDto);
}
