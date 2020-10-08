package com.ronn.sbreferencearchitecture.company.application.exception.model;

public class NotValid extends RuntimeException {

  public NotValid(String message, String id) {
    super(String.format(message, id));
  }

}
