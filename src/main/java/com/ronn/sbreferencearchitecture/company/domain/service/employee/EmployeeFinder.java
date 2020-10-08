package com.ronn.sbreferencearchitecture.company.domain.service.employee;

import com.ronn.sbreferencearchitecture.company.domain.model.Employee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeFinder {

  Optional<Employee> find(UUID id);

  List<Employee> getAll(int page, int size);
}
