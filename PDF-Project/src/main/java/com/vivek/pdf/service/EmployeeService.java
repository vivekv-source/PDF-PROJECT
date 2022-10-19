package com.vivek.pdf.service;

import java.util.List;

import com.vivek.pdf.entity.Employee;

public interface EmployeeService {
	
//	Get
	public void addEmp(Employee employee);
	public List<Employee> getEmployeeList();
	
//	Save
//	public void saveEmp(Employee emp);
//	public void saveAllEmp(List<Employee> emplist);
//	
////	Delete
//	public void deleteEmpById(Integer empId);
//	public void deleteAllEmp();
	

}
