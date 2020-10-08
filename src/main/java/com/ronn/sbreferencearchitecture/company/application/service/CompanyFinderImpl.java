package com.ronn.sbreferencearchitecture.company.application.service;

import com.ronn.sbreferencearchitecture.company.domain.model.Company;
import com.ronn.sbreferencearchitecture.company.domain.repo.CompanyRepository;
import com.ronn.sbreferencearchitecture.company.domain.service.company.CompanyFinder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CompanyFinderImpl implements CompanyFinder {

  private final CompanyRepository companyRepo;

  public CompanyFinderImpl(CompanyRepository companyRepo) {
    this.companyRepo = companyRepo;
  }

  @Override
  public List<Company> getAll(int page, int size) {
    return companyRepo.getAll(page, size);
  }

  @Override
  public Optional<Company> find(UUID id) {
    return companyRepo.find(id);
  }
}
