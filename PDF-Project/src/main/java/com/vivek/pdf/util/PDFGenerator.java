package com.vivek.pdf.util;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.vivek.pdf.entity.Employee;

@Component
public class PDFGenerator {
	public void generate(List <Employee> employeeList, HttpServletResponse response) throws DocumentException, IOException{
		Document document = new Document(PageSize.A4);
		
		PdfWriter.getInstance(document, response.getOutputStream());
		
		document.open();
		
		Font fontTitle= FontFactory.getFont(FontFactory.TIMES_ROMAN);
		fontTitle.setSize(20);
		
		Paragraph para= new Paragraph("List of Employee", fontTitle);
		
		para.setAlignment(Paragraph.ALIGN_CENTER);
		
		document.add(para);
		
		PdfPTable table = new PdfPTable(5);
		
		table.setWidthPercentage(100f);
		table.setWidths(new int[] {3,3,3,3,3});
		table.setSpacingBefore(5);
		
		PdfPCell cell = new PdfPCell();
		cell.setBackgroundColor(CMYKColor.BLUE);
		cell.setPadding(5);
		
		Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
		font.setColor(CMYKColor.WHITE);
		
		cell.setPhrase(new Phrase("Employee ID", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Name", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("City", font));
		table.addCell(cell);	
		
		cell.setPhrase(new Phrase("Department", font));
		table.addCell(cell);	
		
		cell.setPhrase(new Phrase("Salary", font));
		table.addCell(cell);
		
		for(Employee employee:employeeList) {
			table.addCell(String.valueOf(employee.getEmpId()));
		      table.addCell(employee.getEmpName());
		      table.addCell(employee.getEmpCity());
		      table.addCell(employee.getEmpDept());
		      table.addCell(String.valueOf(employee.getEmpSal()));
		}
		document.add(table);
		document.close();
		
	}
	

}
