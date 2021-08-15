package com.kh.hw.employee.model.vo;

public class Employee {
	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;
	
	public Employee() {
		
	}
	
	public Employee(int empNo, String name, char gender) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
	}
	
	public Employee(int empNo, String name, char gender, 
		String phone, String dept, int salary, double bonus) {
		
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.dept = dept;
		this.salary = salary;
		this.bonus = bonus;
		
		
	}
		
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
		
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	
	
	
	public String printEmployee() {
		
		
	}

}

