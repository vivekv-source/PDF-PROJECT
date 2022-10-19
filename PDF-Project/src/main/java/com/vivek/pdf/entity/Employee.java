package com.vivek.pdf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lowagie.text.pdf.PdfPCell;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer empId;
	@Column
	private String empName;
	@Column
	private String empCity;
	@Column
	private String empDept;
	@Column
	private Integer empSal;

	public Employee() {
		
	}

	public Employee(Integer empId, String empName, String empCity, String empDept, Integer empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.empDept = empDept;
		this.empSal = empSal;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public Integer getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Integer empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + ", empDept=" + empDept
				+ ", empSal=" + empSal + "]";
	}
	
	
}
