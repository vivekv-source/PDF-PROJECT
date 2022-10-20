package com.vivek.pdf.service;

import java.util.List;

import com.vivek.pdf.entity.Employee;

public interface EmployeeService {
	
//	Get
	public List<Employee> getAllEmp(); 
	
//	Save
	public void saveEmp(Employee emp);
		
//	Delete
	public void deleteAllEmp();
	

}
