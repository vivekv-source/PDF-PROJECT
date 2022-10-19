package com.vivek.pdf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.vivek.pdf.entity.Employee;
import com.vivek.pdf.service.EmployeeService;

@SpringBootApplication
public class PdfProjectApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PdfProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		for (int i = 0; i <= 10; i++) {
			Employee emp= new Employee();
			emp.setEmpName("Vivek");
			emp.setEmpCity("Pune");
			emp.setEmpDept("IT");
			emp.setEmpSal(98000);
			
			employeeService.addEmp(emp);
//		}

			
	}

}
