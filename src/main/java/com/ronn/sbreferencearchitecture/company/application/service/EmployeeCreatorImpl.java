package com.ronn.sbreferencearchitecture.company.application.service;

import com.ronn.sbreferencearchitecture.company.domain.model.Employee;
import com.ronn.sbreferencearchitecture.company.domain.repo.CompanyRepository;
import com.ronn.sbreferencearchitecture.company.domain.service.employee.EmployeeCreator;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EmployeeCreatorImpl implements EmployeeCreator {

  private final CompanyRepository companyRepo;

  public EmployeeCreatorImpl(CompanyRepository companyRepo) {
    this.companyRepo = companyRepo;
  }

  @Override
  public UUID create(Employee employee) {
    return companyRepo.save(employee);
  }
}
