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
	SpringApplication.run(PdfProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

			Employee emp= new Employee();
			emp.setEmpName("Vivek");
			emp.setEmpCity("Pune");
			emp.setEmpDept("IT");
			emp.setEmpSal(60000);
			
			Employee emp2= new Employee();
			emp2.setEmpName("Shivam");
			emp2.setEmpCity("Pune");
			emp2.setEmpDept("Testing");
			emp2.setEmpSal(18000);
			
			Employee emp3= new Employee();
			emp3.setEmpName("Raj");
			emp3.setEmpCity("Banglore");
			emp3.setEmpDept("IT");
			emp3.setEmpSal(50000);
			
			Employee emp4= new Employee();
			emp4.setEmpName("Rohit");
			emp4.setEmpCity("Vashi");
			emp4.setEmpDept("Analysist");
			emp4.setEmpSal(98000);
			
			Employee emp5= new Employee();
			emp5.setEmpName("Pooja");
			emp5.setEmpCity("Pune");
			emp5.setEmpDept("Desk Support");
			emp5.setEmpSal(98000);
			
			Employee emp6= new Employee();
			emp6.setEmpName("Ram");
			emp6.setEmpCity("Mumbai");
			emp6.setEmpDept("IT");
			emp6.setEmpSal(60000);
			
			Employee emp7= new Employee();
			emp7.setEmpName("Sonan");
			emp7.setEmpCity("Delhi");
			emp7.setEmpDept("Developement");
			emp7.setEmpSal(20000);
			
			Employee emp8= new Employee();
			emp8.setEmpName("Rahul");
			emp8.setEmpCity("Pune");
			emp8.setEmpDept("HR");
			emp8.setEmpSal(80000);
			
			employeeService.addEmp(emp);
			
			employeeService.addEmp(emp2);
			
			employeeService.addEmp(emp3);
			
			employeeService.addEmp(emp4);
			
			employeeService.addEmp(emp5);
			
			employeeService.addEmp(emp6);
			
			employeeService.addEmp(emp7);
			
			employeeService.addEmp(emp8);
		
			
	}

}
