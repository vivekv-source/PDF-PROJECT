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
	private EmployeeRepo repo;

	@Override
	public List<Employee> getAllEmp() {
		Iterable<Employee> empItr = repo.findAll();
		List<Employee> emplist = new ArrayList<Employee>();
		empItr.forEach(x -> emplist.add(x));
		return emplist;
	}

	@Override
	public void saveEmp(Employee emp) {
		repo.save(emp);
	}

	@Override
	public void deleteAllEmp() {
		repo.deleteAll();
	}

}
