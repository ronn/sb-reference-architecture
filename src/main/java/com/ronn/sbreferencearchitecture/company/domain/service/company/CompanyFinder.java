package com.ronn.sbreferencearchitecture.company.domain.service.company;

import com.ronn.sbreferencearchitecture.company.domain.model.Company;

import java.util.List;
import java.util.UUID;

public interface CompanyFinder {

  List<Company> getAll();
  Company find(UUID id);
}
