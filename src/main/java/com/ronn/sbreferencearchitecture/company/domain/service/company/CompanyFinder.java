package com.ronn.sbreferencearchitecture.company.domain.service.company;

import com.ronn.sbreferencearchitecture.company.domain.model.Company;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CompanyFinder {

  List<Company> getAll(int page, int size);

  Optional<Company> find(UUID id);
}
