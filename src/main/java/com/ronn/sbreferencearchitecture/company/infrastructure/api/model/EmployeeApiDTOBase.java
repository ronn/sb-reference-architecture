package com.ronn.sbreferencearchitecture.company.infrastructure.api.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public abstract class EmployeeApiDTOBase {

  private final String id;

  @NotNull(message = "bornDate is required")
  private final LocalDateTime bornDate;

  @NotNull(message = "age is required")
  private final Integer age;

  @NotBlank(message = "fullName is required")
  private final String fullName;

  protected EmployeeApiDTOBase(String id, @NotNull LocalDateTime bornDate, @NotNull Integer age, @NotBlank String fullName) {
    this.id = id;
    this.bornDate = bornDate;
    this.age = age;
    this.fullName = fullName;
  }

  public String getId() {
    return id;
  }

  public LocalDateTime getBornDate() {
    return bornDate;
  }

  public Integer getAge() {
    return age;
  }

  public String getFullName() {
    return fullName;
  }
}
