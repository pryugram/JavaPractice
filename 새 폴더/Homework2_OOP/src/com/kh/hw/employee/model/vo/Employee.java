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
	
	public Employee(int empNo, String name, char gender, String phone) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
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
	public double getBonus () {
		return bonus;
		
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
		
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
		
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
	public String printEmployee() {
		String str =  empNo + " " + name + " " + phone + " " + dept + " " + salary + " " + bonus;
		
		return str;
	}

}

