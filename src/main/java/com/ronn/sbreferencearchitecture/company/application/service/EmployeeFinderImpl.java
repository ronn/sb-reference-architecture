package com.ronn.sbreferencearchitecture.company.application.service;

import com.ronn.sbreferencearchitecture.company.domain.model.Employee;
import com.ronn.sbreferencearchitecture.company.domain.repo.CompanyRepository;
import com.ronn.sbreferencearchitecture.company.domain.service.employee.EmployeeFinder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeFinderImpl implements EmployeeFinder {

  private final CompanyRepository companyRepo;

  public EmployeeFinderImpl(CompanyRepository companyRepo) {
    this.companyRepo = companyRepo;
  }

  @Override
  public Optional<Employee> findEmployee(UUID id) {
    return companyRepo.findEmployee(id);
  }

  @Override
  public List<Employee> getAllEmployees(int page, int size) {
    return companyRepo.getAllEmployees(page, size);
  }
}
