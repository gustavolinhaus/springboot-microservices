package com.microservice.departmentservice.dto;

public record DepartmentPostRequestDto(Long id, String name, String description, String code) {
}
