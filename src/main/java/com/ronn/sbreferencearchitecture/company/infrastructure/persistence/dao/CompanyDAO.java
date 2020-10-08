package com.ronn.sbreferencearchitecture.company.infrastructure.persistence.dao;

import com.ronn.sbreferencearchitecture.company.infrastructure.persistence.model.CompanyDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDAO extends JpaRepository<CompanyDTO, String> {
}
