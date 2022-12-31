package com.sushiltech.azure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String employeeid;
	private String empFirstName;
	private String empLastName;
	private String emailId;

}
