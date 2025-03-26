package com.microservice.employeeservice.mapper;

import com.microservice.employeeservice.dto.EmployeeGetResponseDto;
import com.microservice.employeeservice.dto.EmployeePostRequestDto;
import com.microservice.employeeservice.dto.EmployeePostResponseDto;
import com.microservice.employeeservice.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmployeeMapper {

    Employee toEmployee(EmployeePostRequestDto employeePostRequestDto);
    EmployeePostResponseDto toEmployeePostResponseDto(Employee employee);
    EmployeeGetResponseDto toEmployeeGetResponseDto(Employee employee);

}
