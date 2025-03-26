package com.microservice.employeeservice.dto;

public record EmployeePostRequestDto(String firstName, String lastName, String email, String departmentCode, String organizationCode) {
}
