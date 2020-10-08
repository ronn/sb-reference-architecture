package com.ronn.sbreferencearchitecture.company.infrastructure.persistence.mapper;

import com.ronn.sbreferencearchitecture.company.domain.model.Employee;
import com.ronn.sbreferencearchitecture.company.infrastructure.persistence.model.EmployeeDTO;
import com.ronn.sbreferencearchitecture.shared.util.UUIDUtils;

import java.util.List;
import java.util.UUID;

import static java.util.stream.Collectors.toList;

public class EmployeeMapper {

  public static Employee toEmployee(EmployeeDTO dto) {
    return new Employee(
        null != dto.getId() ? UUIDUtils.from(dto.getId()) : UUID.randomUUID(),
        dto.getBornDate(),
        dto.getAge(),
        dto.getFullName(),
        dto.getCompanyId());
  }

  public static EmployeeDTO fromEmployee(Employee employee) {
    return new EmployeeDTO(
        employee.getId().toString(),
        employee.getBornDate(),
        employee.getAge(),
        employee.getFullName(),
        employee.getCompanyId()
    );
  }

  public static List<Employee> toEmployees(List<EmployeeDTO> dtos) {
    return dtos.stream()
        .map(EmployeeMapper::toEmployee)
        .collect(toList());
  }

  public static List<EmployeeDTO> fromEmployees(List<Employee> employees) {
    return employees.stream()
        .map(EmployeeMapper::fromEmployee)
        .collect(toList());
  }
}
