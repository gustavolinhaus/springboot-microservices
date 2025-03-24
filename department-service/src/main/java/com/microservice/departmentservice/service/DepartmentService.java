package com.microservice.departmentservice.service;

import com.microservice.departmentservice.entity.Department;
import com.microservice.departmentservice.exception.NotFoundException;
import com.microservice.departmentservice.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public Department findByCode(String code) {
        return departmentRepository.findByCode(code)
                .orElseThrow(() -> new NotFoundException("Department not found"));
    }

    @Transactional
    public Department save(Department department) {
        return departmentRepository.save(department);
    }
}
