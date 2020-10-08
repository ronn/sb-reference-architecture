package com.ronn.sbreferencearchitecture.company.infrastructure.api.mapper;

import com.ronn.sbreferencearchitecture.company.domain.model.Employee;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.model.request.EmployeeRequest;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.model.response.EmployeeResponse;
import com.ronn.sbreferencearchitecture.shared.util.UUIDUtils;

import java.util.List;
import java.util.UUID;

import static java.util.stream.Collectors.toList;

public class EmployeeMapper {

  public static Employee toEmployee(EmployeeRequest req) {
    return new Employee(
        null != req.getId() ? UUIDUtils.from(req.getId()) : UUID.randomUUID(),
        req.getBornDate(),
        req.getAge(),
        req.getFullName(),
        ""
    );
  }

  public static EmployeeResponse fromEmployee(Employee employee) {
    return new EmployeeResponse(
        employee.getId().toString(),
        employee.getBornDate(),
        employee.getAge(),
        employee.getFullName()
    );
  }

  public static List<EmployeeResponse> fromEmployees(List<Employee> employees) {
    return employees.stream()
        .map(EmployeeMapper::fromEmployee)
        .collect(toList());
  }
}
