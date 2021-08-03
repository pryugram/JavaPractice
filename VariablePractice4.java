package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void method4() {
		System.out.println("------------실습문제4----------------");
		String eng;
		Scanner sc4 = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		eng = sc4.nextLine();
		
		System.out.println("첫 번재 문자 : " + eng.charAt(0));
		System.out.println("두 번재 문자 : " + eng.charAt(1));
		System.out.println("세 번재 문자 : " + eng.charAt(2));
		
		
	}

}
