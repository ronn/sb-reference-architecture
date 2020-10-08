package com.ronn.sbreferencearchitecture.company.application.exception.model;

import com.ronn.sbreferencearchitecture.company.application.constants.ExceptionConstants;

public class EmployeeNotFound extends NotFound {

  public EmployeeNotFound(String id) {
    super(ExceptionConstants.EMPLOYEE_NOT_FOUND, id);
  }
}
