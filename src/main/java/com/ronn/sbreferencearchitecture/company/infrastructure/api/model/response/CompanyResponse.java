package com.ronn.sbreferencearchitecture.company.infrastructure.api.model.response;

import com.ronn.sbreferencearchitecture.company.infrastructure.api.model.CompanyApiDTOBase;

import javax.validation.constraints.NotBlank;

public class CompanyResponse extends CompanyApiDTOBase {

  public CompanyResponse(String id, @NotBlank(message = "Company's name is required") String name) {
    super(id, name);
  }
}
