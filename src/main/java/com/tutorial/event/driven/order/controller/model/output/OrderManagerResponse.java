package com.tutorial.event.driven.order.controller.model.output;

import com.tutorial.event.driven.order.util.RestConstants;
import lombok.Data;

import java.io.Serializable;

@Data
public class OrderManagerResponse<T> implements Serializable {

  private static final long serialVersionUID = -2972960671408835123L;

  private String code;
  private String message;
  private transient T data;

  public OrderManagerResponse(final String code, final String message, final T data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  public OrderManagerResponse(final String code, final String message) {
    this.code = code;
    this.message = message;
  }

  public OrderManagerResponse(final T data) {
    code = RestConstants.OK_CODE;
    message = RestConstants.SUCCESS_MESSAGE;
    this.data = data;
  }
}
