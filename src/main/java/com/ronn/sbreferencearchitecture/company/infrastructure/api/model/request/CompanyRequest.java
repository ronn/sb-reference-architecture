package com.ronn.sbreferencearchitecture.company.infrastructure.api.model.request;

import com.ronn.sbreferencearchitecture.company.infrastructure.api.model.CompanyApiDTOBase;

import javax.validation.constraints.NotBlank;

public class CompanyRequest extends CompanyApiDTOBase {

  protected CompanyRequest(String id, @NotBlank(message = "Company's name is required") String name) {
    super(id, name);
  }
}
