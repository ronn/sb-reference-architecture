package com.ronn.sbreferencearchitecture.company.domain.repo;

import com.ronn.sbreferencearchitecture.company.domain.model.Company;
import com.ronn.sbreferencearchitecture.company.domain.model.Employee;

import java.util.List;
import java.util.UUID;

public interface CompanyRepository {

  Company find(UUID id);
  List<Company> getAll();
  UUID save(Company company);

  Employee findEmployee(UUID id);
  List<Employee> getAllEmployees();
  UUID save(Employee employee);
}
