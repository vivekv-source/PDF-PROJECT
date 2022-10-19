package com.vivek.pdf.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.pdf.entity.Employee;
import com.vivek.pdf.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo empRepo;

	@Override
	public void addEmp(Employee employee) {
		empRepo.save(employee);
		
	}

	@Override
	public List<Employee> getEmployeeList() {
//		Iterable<Employee> empItr = empRepo.findAll();
//		List<Employee> emplist= new ArrayList<Employee>();
//		empItr.forEach(x-> emplist.add(x));
//		return emplist;
		return empRepo.findAll();

	}

//	@Override
//	public void saveEmp(Employee emp) {
//		empRepo.save(emp);
//	}
//	@Override
//	public void saveAllEmp(List<Employee> emplist) {
//		empRepo.saveAll(emplist);
//		
//	}
//
//	@Override
//	public void deleteEmpById(Integer empId) {
//		empRepo.deleteById(empId);
//		
//	}

//	@Override
//	public void deleteAllEmp() {
//		empRepo.deleteAll();
//		
//	}

	

}
