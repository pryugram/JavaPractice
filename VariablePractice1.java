package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public void method1() {
		System.out.println("------------실습문제1----------------");
		String name;
		char gender;
		int age;
		double height;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		gender = sc.nextLine().charAt(0);
		
		System.out.print("나이를 입력하세요 : ");
		age = Integer.parseInt(sc.nextLine());
		
		System.out.print("키를 입력하세요(cm) : ");
		height = Double.parseDouble(sc.nextLine());
		
		System.out.println("키 " + height + "cm인 " + age + "살 " + gender + "자 " + name +"님 반갑습니다 ^^");
		
		
	}


}
