package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public  void method2() {
		System.out.println("------------�ǽ�����2----------------");
		int num1 = 23;
		int num2 = 7;
		Scanner sc2 = new Scanner(System.in);
		
		
		
		System.out.print("ù ��° ���� : ");
		num1 = Integer.parseInt(sc2.nextLine());
		System.out.print("�� ��° ���� : ");
		num2 = Integer.parseInt(sc2.nextLine());
		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ ��� : " + (num1 / num2));
		
		
	}
	
}
