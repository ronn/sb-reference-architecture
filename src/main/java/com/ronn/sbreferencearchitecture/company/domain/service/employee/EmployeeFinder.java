package com.ronn.sbreferencearchitecture.company.domain.service.employee;

import com.ronn.sbreferencearchitecture.company.domain.model.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeFinder {

  Employee findEmployee(UUID id);

  List<Employee> getAllEmployees();
}
