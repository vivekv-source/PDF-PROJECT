package com.vivek.pdf.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.lowagie.text.DocumentException;
import com.vivek.pdf.entity.Employee;
import com.vivek.pdf.service.EmployeeService;
import com.vivek.pdf.util.PDFGenerator;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	

	@GetMapping("/emp")
	public ResponseEntity<List<Employee>> getAllEmployee1(){
		List<Employee>list=service.getAllEmp();
		if(list.size()<=0)
		{
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}else {
			
			return ResponseEntity.of(Optional.of(list));
		}
	
	}

	@GetMapping("/emp/list")
	public void findAllEmp() {
		this.service.getAllEmp();
	}

	@DeleteMapping("/emp/delete")
	public String deleteAll() {
		service.deleteAllEmp();
		return "Deleted";
	}
	
	@GetMapping("/pdf")
	public void generatePdfFile(HttpServletResponse response) throws DocumentException, IOException {
		response.setContentType("application/pdf");
		String headerkey = "Content-Disposition";
		String headervalue = "attachment; filename=employee" + ".pdf";
		response.setHeader(headerkey, headervalue);

		List<Employee> listofEmployees = service.getAllEmp();

		PDFGenerator generator = new PDFGenerator();
		generator.generate(listofEmployees, response);

	}
}
