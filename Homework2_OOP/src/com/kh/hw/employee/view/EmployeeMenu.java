package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
		Scanner sc = new Scanner(System.in);
		EmployeeController ec = new EmployeeController();
			
		public EmployeeMenu() {
			
			System.out.println("1. ��� �߰� ");
			System.out.println("2. ��� ���� ");
			System.out.println("3. ��� ���� ");
			System.out.println("4. ��� ��� ");
			System.out.println("9. ���α׷� ����");
			
			System.out.print("�޴� ��ȣ�� �������� : ");
			int menuNumber = Integer.parseInt(sc.nextLine());
			
			
		}
		
		public void insertEmp() {
			System.out.print("��� ��ȣ : ");
			System.out.print("��� �̸� : ");
			System.out.print("��� ���� : ");
			System.out.print("��ȭ ��ȣ : ");
			
			
		}
	
		public void updateEmp() {
			
		}
		
		public void deleteEmp() {
		}
			
		public void printEmp() {
				
		}
	
}
