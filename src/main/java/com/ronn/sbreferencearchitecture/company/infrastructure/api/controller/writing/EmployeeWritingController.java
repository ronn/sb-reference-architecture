package com.ronn.sbreferencearchitecture.company.infrastructure.api.controller.writing;

import com.ronn.sbreferencearchitecture.company.domain.model.Employee;
import com.ronn.sbreferencearchitecture.company.domain.service.employee.EmployeeCreator;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.mapper.EmployeeMapper;
import com.ronn.sbreferencearchitecture.company.infrastructure.api.model.request.EmployeeRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/employee")
public class EmployeeWritingController extends BaseController {

  private final EmployeeCreator employeeCreator;

  public EmployeeWritingController(EmployeeCreator employeeCreator) {
    this.employeeCreator = employeeCreator;
  }

  @PostMapping
  private ResponseEntity<UUID> create(@Valid @RequestBody EmployeeRequest request) {
    Employee employee = EmployeeMapper.toEmployee(request);
    UUID uuid = employeeCreator.create(employee);

    return build(uuid);
  }
}
