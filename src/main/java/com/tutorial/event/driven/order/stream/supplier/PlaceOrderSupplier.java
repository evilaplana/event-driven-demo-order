package com.tutorial.event.driven.order.stream.supplier;

import com.tutorial.event.driven.order.stream.model.output.PlaceOrderMessageDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class PlaceOrderSupplier {

  @Value("${spring.cloud.stream.bindings.processPlaceOrderMessage-out-0.destination}")
  private String placeOrderQueue;

  @Autowired private StreamBridge streamBridge;

  public void processPlaceOrderMessage(final PlaceOrderMessageDto orderRequestDto) {
    streamBridge.send(placeOrderQueue, orderRequestDto);
  }
}
