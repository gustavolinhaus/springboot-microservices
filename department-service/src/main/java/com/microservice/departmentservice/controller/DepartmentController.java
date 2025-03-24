package com.microservice.departmentservice.controller;

import com.microservice.departmentservice.dto.DepartmentGetResponseDto;
import com.microservice.departmentservice.dto.DepartmentPostRequestDto;
import com.microservice.departmentservice.dto.DepartmentPostResponseDto;
import com.microservice.departmentservice.mapper.DepartmentMapper;
import com.microservice.departmentservice.service.DepartmentService;
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
@RequestMapping("v1/departments")
@AllArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;
    private final DepartmentMapper departmentMapper;

    @GetMapping("{code}")
    public ResponseEntity<DepartmentGetResponseDto> findByCode(@PathVariable String code) {
        var department = departmentService.findByCode(code);
        var departmentGetResponseDto = departmentMapper.toDepartmentGetResponseDto(department);
        return ResponseEntity.ok(departmentGetResponseDto);
    }

    @PostMapping
    public ResponseEntity<DepartmentPostResponseDto> save(@RequestBody DepartmentPostRequestDto departmentPostRequestDto) {
        var department = departmentMapper.toDepartment(departmentPostRequestDto);
        var savedDepartment = departmentService.save(department);
        var departmentPostResponseDto = departmentMapper.toDepartmentPostResponseDto(savedDepartment);
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentPostResponseDto);
    }
}
