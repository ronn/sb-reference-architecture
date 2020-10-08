package com.ronn.sbreferencearchitecture.company.domain.repo;

import com.ronn.sbreferencearchitecture.company.domain.model.Company;
import com.ronn.sbreferencearchitecture.company.domain.model.Employee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CompanyRepository {

  Optional<Company> find(UUID id);

  List<Company> getAll(int page, int size);

  UUID save(Company company);

  Optional<Employee> findEmployee(UUID id);

  List<Employee> getAllEmployees(int page, int size);

  UUID save(Employee employee);
}
