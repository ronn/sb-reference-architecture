package com.ronn.sbreferencearchitecture.company.infrastructure.api.model;

import javax.validation.constraints.NotBlank;

public abstract class CompanyApiDTOBase {

  private final String id;

  @NotBlank(message = "Company's name is required")
  private final String name;

  public CompanyApiDTOBase(String id, @NotBlank(message = "Company's name is required") String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
