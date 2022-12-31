package com.sushiltech.azure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sushiltech.azure.entity.Employee;
import com.sushiltech.azure.service.EmployeeService;

@Controller
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
public Employee saveEmployee(@RequestBody Employee emp) {
	return employeeService.employeeSave(emp);
	
}
}
