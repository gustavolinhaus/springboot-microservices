package com.microservice.employeeservice.controller;

import com.microservice.employeeservice.dto.EmployeeGetResponseDto;
import com.microservice.employeeservice.dto.EmployeePostRequestDto;
import com.microservice.employeeservice.dto.EmployeePostResponseDto;
import com.microservice.employeeservice.mapper.EmployeeMapper;
import com.microservice.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/employees")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

    @GetMapping("{id}")
    public ResponseEntity<EmployeeGetResponseDto> findById(@PathVariable Long id) {
        var employee = employeeService.findById(id);
        var employeeGetResponseDto = employeeMapper.toEmployeeGetResponseDto(employee);
        return ResponseEntity.ok(employeeGetResponseDto);
    }

    @PostMapping
    public ResponseEntity<EmployeePostResponseDto> save(@RequestBody EmployeePostRequestDto employeePostRequestDto) {
        var employee = employeeMapper.toEmployee(employeePostRequestDto);
        var savedEmployee = employeeService.save(employee);
        var employeePostResponseDto = employeeMapper.toEmployeePostResponseDto(savedEmployee);
        return ResponseEntity.status(HttpStatus.CREATED).body(employeePostResponseDto);
    }
}
