package com.microservice.employeeservice.dto;

public record EmployeePostResponseDto(Long id, String firstName, String lastName, String email, String departmentCode, String organizationCode) {
}
