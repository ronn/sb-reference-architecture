package com.ronn.sbreferencearchitecture.company.domain.service.employee;

import com.ronn.sbreferencearchitecture.company.domain.model.Employee;

import java.util.UUID;

public interface EmployeeCreator {

  UUID create(Employee employee);
}
