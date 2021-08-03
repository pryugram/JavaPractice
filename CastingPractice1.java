package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void method1() {
		System.out.println("------------실습문제1----------------");
		
		char a;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("문자 : ");
		a = sc1.nextLine().charAt(0);
		
		System.out.println(a + " unicode : " + (int)a);
		
	}
	
}
