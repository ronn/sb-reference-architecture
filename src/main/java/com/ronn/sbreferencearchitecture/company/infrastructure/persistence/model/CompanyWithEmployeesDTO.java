package com.ronn.sbreferencearchitecture.company.infrastructure.persistence.model;

import java.util.List;

public class CompanyWithEmployeesDTO extends CompanyDTO {

  private final List<EmployeeDTO> employees;

  public CompanyWithEmployeesDTO(String id, String name, List<EmployeeDTO> employees) {
    super(id, name);
    this.employees = employees;
  }

  public List<EmployeeDTO> getEmployees() {
    return employees;
  }
}
