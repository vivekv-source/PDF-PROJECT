package com.vivek.pdf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vivek.pdf.entity.Employee;
//@EnableJpaRepositories
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	public void addEmployee(Employee employee);

	List<Employee> getEmployeeList();

}
