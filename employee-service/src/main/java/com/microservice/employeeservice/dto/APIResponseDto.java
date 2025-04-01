package com.microservice.employeeservice.dto;

public record APIResponseDto(EmployeeGetResponseDto employee, DepartmentGetResponseDto department) {
}
