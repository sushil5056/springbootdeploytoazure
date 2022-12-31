package com.sushiltech.azure.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sushiltech.azure.entity.Employee;
import com.sushiltech.azure.repository.EmployeeRepo;

public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	
	public Employee employeeSave(Employee emp) {
		
		return employeeRepo.save(emp);
	}

}
