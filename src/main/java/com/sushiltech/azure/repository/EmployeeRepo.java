package com.sushiltech.azure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sushiltech.azure.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {

}
