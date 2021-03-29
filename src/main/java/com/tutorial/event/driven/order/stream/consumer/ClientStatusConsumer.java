package com.tutorial.event.driven.order.stream.consumer;

import com.tutorial.event.driven.order.stream.model.input.ClientStatusMessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class ClientStatusConsumer {

  @Bean
  public Consumer<ClientStatusMessageDto> processClientStatusMessage() {
    return clientStatus -> log.info(clientStatus.toString());
  }
}
