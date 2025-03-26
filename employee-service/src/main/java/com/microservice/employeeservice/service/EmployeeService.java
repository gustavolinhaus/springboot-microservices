package com.microservice.employeeservice.service;

import com.microservice.employeeservice.entity.Employee;
import com.microservice.employeeservice.exception.NotFoundException;
import com.microservice.employeeservice.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee findById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Employee not found"));
    }

    @Transactional
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
