package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void method1() {
		System.out.println("------------�ǽ�����1----------------");
		
		char a;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("���� : ");
		a = sc1.nextLine().charAt(0);
		
		System.out.println(a + " unicode : " + (int)a);
		
	}
	
}
