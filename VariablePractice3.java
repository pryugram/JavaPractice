package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void method3() {
		System.out.println("------------�ǽ�����3----------------");
		Scanner sc3 = new Scanner(System.in);
		double w1;
		double h1;
		
		System.out.print("���� : ");
		w1 = Double.parseDouble(sc3.next());
		System.out.print("���� : ");
		h1 = Double.parseDouble(sc3.next());
		System.out.println("���� : " + (w1 * h1));
		System.out.println("�ѷ� : " + 2 * (w1 + h1));
	}

}
