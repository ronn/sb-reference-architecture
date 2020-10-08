package com.ronn.sbreferencearchitecture.company.application.exception.model;

import com.ronn.sbreferencearchitecture.company.application.constants.ExceptionConstants;

public class UUIDNotValid extends NotValid {

  public UUIDNotValid(String uuid) {
    super(ExceptionConstants.UUID_NOT_VALID, uuid);
  }
}
