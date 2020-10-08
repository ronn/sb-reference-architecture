package com.ronn.sbreferencearchitecture.company.application.service;

import com.ronn.sbreferencearchitecture.company.domain.model.Company;
import com.ronn.sbreferencearchitecture.company.domain.repo.CompanyRepository;
import com.ronn.sbreferencearchitecture.company.domain.service.company.CompanyCreator;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CompanyCreatorImpl implements CompanyCreator {

  private final CompanyRepository companyRepo;

  public CompanyCreatorImpl(CompanyRepository companyRepo) {
    this.companyRepo = companyRepo;
  }

  public UUID create(Company company) {
    return companyRepo.save(company);
  }
}
