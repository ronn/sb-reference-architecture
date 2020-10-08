package com.ronn.sbreferencearchitecture.company.application.exception.model;

import com.ronn.sbreferencearchitecture.company.application.constants.ExceptionConstants;

public class CompanyNotFound extends NotFound {
  public CompanyNotFound(String id) {
    super(ExceptionConstants.COMPANY_NOT_FOUND, id);
  }
}
