package com.vivek.pdf.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lowagie.text.DocumentException;
import com.vivek.pdf.entity.Employee;
import com.vivek.pdf.service.EmployeeService;
import com.vivek.pdf.util.PDFGenerator;

//@RestController 
@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/export-to-pdf")
	public void generatePdfFile(HttpServletResponse response) throws DocumentException, IOException{
		response.setContentType("application/pdf");
		
	    DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");

	    String currentDateTime = dateFormat.format(new Date());

	    String headerkey = "Content-Disposition";

	    String headervalue = "attachment; filename=employee" + currentDateTime + ".pdf";

	    response.setHeader(headerkey, headervalue);

	    List<Employee> listofEmployees = employeeService.getEmployeeList();

	    PDFGenerator generator = new PDFGenerator();

	    generator.generate(listofEmployees, response);


	}

}
