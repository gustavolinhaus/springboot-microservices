package com.microservice.employeeservice.dto;

public record EmployeeGetResponseDto(Long id, String firstName, String lastName, String email, String departmentCode, String organizationCode) {
}
