package com.ronn.sbreferencearchitecture.company.infrastructure.api.model.response;

import com.ronn.sbreferencearchitecture.company.infrastructure.api.model.EmployeeApiDTOBase;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class EmployeeResponse extends EmployeeApiDTOBase {

  protected EmployeeResponse(String id, @NotNull LocalDateTime bornDate, @NotNull Integer age, @NotBlank String fullName) {
    super(id, bornDate, age, fullName);
  }
}
