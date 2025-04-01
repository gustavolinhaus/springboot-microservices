package com.microservice.employeeservice.mapper;

import com.microservice.employeeservice.dto.APIResponseDto;
import com.microservice.employeeservice.dto.DepartmentGetResponseDto;
import com.microservice.employeeservice.dto.EmployeeGetResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface APIMapper {

    APIResponseDto toApiResponseDto(EmployeeGetResponseDto employee, DepartmentGetResponseDto department);
}
