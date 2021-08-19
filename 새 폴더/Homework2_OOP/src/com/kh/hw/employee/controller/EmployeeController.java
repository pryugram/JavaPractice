package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	private Employee e = new Employee();
	
	public void add(int empNo, String name, char gender, String phone) {
//		e.setEmpNo(empNo);
//		e.setName(name);
//		e.setGender(gender);
//		e.setPhone(phone);
		
		this.e = new Employee(empNo, name, gender, phone);
	}
	
	public void add(int empNo, String name, char gender, String phone,
								String dept, int salary, double bonus) {
//		e.setEmpNo(empNo);
//		e.setName(name);
//		e.setGender(gender);
//		e.setPhone(phone);
//		e.setDept(dept);
//		e.setSalary(salary);
//		e.setBonus(bonus);
		this.e = new Employee(empNo, name, gender, phone, dept, salary, bonus);
		
		
	}
	
	public void modify(String phone) {
			this.e.setPhone(phone);
//			e.setPhone(phone);
	}
	
	public void modify(int salary) {
			this.e.setSalary(salary);
//			e.setSalary(salary);
	}
	public void modify(double bonus) {
		this.e.setBonus(bonus);
//			e.setBonus(bonus);
	}
	public Employee remove() {
//	e = null;		//??	?	??			toLowerCase�� ��? -> null pointer Exception		
			//1. null check �ʼ�
		
			
		e = new Employee();			//�ʱ�ȭ
//		e.setBonus(0);
		return e;
				//?
	}
	
	public String inform() {
		if(e == null) {
			//���⼭ null üũ�� å�� ���
			return null;
		}
		else
		{
			return e.printEmployee();
		}
		
//		return e.printEmployee();	//�̰͸� ���⳪?
			
			
	}
	
}
