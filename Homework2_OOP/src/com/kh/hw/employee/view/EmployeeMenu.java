package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
		Scanner sc = new Scanner(System.in);
		EmployeeController ec = new EmployeeController();
			
		public EmployeeMenu() {
			
			System.out.println("1. 사원 추가 ");
			System.out.println("2. 사원 수정 ");
			System.out.println("3. 사원 삭제 ");
			System.out.println("4. 사원 출력 ");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 번호를 누르세요 : ");
			int menuNumber = Integer.parseInt(sc.nextLine());
			
			
		}
		
		public void insertEmp() {
			System.out.print("사원 번호 : ");
			System.out.print("사원 이름 : ");
			System.out.print("사원 성별 : ");
			System.out.print("전화 번호 : ");
			
			
		}
	
		public void updateEmp() {
			
		}
		
		public void deleteEmp() {
		}
			
		public void printEmp() {
				
		}
	
}
