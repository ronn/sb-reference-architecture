package com.ronn.sbreferencearchitecture.company.application.service;

import com.ronn.sbreferencearchitecture.company.application.exception.model.CompanyNotFound;
import com.ronn.sbreferencearchitecture.company.application.util.UUIDUtils;
import com.ronn.sbreferencearchitecture.company.domain.model.Company;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.mapper.CompanyMapper;
import com.ronn.sbreferencearchitecture.company.infrastructure.persistence.dao.CompanyDAO;
import com.ronn.sbreferencearchitecture.company.infrastructure.persistence.model.CompanyDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CompanyService {

  private final CompanyDAO companyRepo;

  public CompanyService(CompanyDAO companyRepo) {
    this.companyRepo = companyRepo;
  }

  public List<CompanyDTO> findAll(Pageable pageable) {
    List<Company> companies = companyRepo.findAll(pageable).toList();

    return CompanyMapper.fromCompanies(companies);
  }

  public CompanyDTO findBy(String id) {
    Company company = companyRepo.findById(UUIDUtils.from(id))
        .orElseThrow(() -> new CompanyNotFound(id));

    return CompanyMapper.fromCompany(company);
  }

  public UUID create(CompanyDTO dto) {
    dto.setId(UUID.randomUUID().toString());
    dto.getEmployees().forEach(e -> e.setCompany(dto.getId()));

    return companyRepo.save(CompanyMapper.toCompany(dto)).getId();
  }

  public void delete(String id) {
    companyRepo.deleteById(UUIDUtils.from(id));
  }

  public void update(CompanyDTO dto) {
    companyRepo.save(CompanyMapper.toCompany(dto));
  }
}
