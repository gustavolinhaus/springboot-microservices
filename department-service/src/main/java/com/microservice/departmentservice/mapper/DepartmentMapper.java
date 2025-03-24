package com.microservice.departmentservice.mapper;

import com.microservice.departmentservice.dto.DepartmentGetResponseDto;
import com.microservice.departmentservice.dto.DepartmentPostRequestDto;
import com.microservice.departmentservice.dto.DepartmentPostResponseDto;
import com.microservice.departmentservice.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DepartmentMapper {

    DepartmentGetResponseDto toDepartmentGetResponseDto(Department department);
    Department toDepartment(DepartmentPostRequestDto departmentPostRequestDto);
    DepartmentPostResponseDto toDepartmentPostResponseDto(Department department);
}
