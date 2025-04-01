package com.microservice.employeeservice.service;

import com.microservice.employeeservice.client.APIClient;
import com.microservice.employeeservice.dto.DepartmentGetResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final APIClient apiClient;

    public DepartmentGetResponseDto findDepartmentByCode(String departmentCode) {
        return apiClient.findByCode(departmentCode);
    }
}
