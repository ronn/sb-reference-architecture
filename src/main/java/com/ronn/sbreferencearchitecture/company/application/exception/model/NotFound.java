package com.ronn.sbreferencearchitecture.company.application.exception.model;

public class NotFound extends RuntimeException {

  public NotFound(String message, String id) {
    super(String.format(message, id));
  }
}
