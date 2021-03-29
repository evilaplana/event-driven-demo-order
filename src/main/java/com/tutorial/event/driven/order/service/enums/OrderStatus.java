package com.tutorial.event.driven.order.service.enums;

public enum OrderStatus {
  RECEIVED("RECEIVED"),
  REJECTED("REJECTED"),
  PROCESSED("PROCESSED");

  private final String status;

  OrderStatus(final String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }
}
