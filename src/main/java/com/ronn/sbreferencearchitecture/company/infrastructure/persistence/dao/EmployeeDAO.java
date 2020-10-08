package com.ronn.sbreferencearchitecture.company.infrastructure.persistence.dao;

import com.ronn.sbreferencearchitecture.company.infrastructure.persistence.model.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<EmployeeDTO, String> {
}
