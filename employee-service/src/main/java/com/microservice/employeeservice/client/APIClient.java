package com.microservice.employeeservice.client;

import com.microservice.employeeservice.dto.DepartmentGetResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "department-service")
public interface APIClient {

    @GetMapping("v1/departments/{department-code}")
    DepartmentGetResponseDto findByCode(@PathVariable("department-code") String departmentCode);
}
