package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void method3() {
		System.out.println("------------실습문제3----------------");
		Scanner sc3 = new Scanner(System.in);
		double w1;
		double h1;
		
		System.out.print("가로 : ");
		w1 = Double.parseDouble(sc3.next());
		System.out.print("세로 : ");
		h1 = Double.parseDouble(sc3.next());
		System.out.println("면적 : " + (w1 * h1));
		System.out.println("둘레 : " + 2 * (w1 + h1));
	}

}
