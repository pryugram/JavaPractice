package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public void method1() {
		System.out.println("------------�ǽ�����1----------------");
		String name;
		char gender;
		int age;
		double height;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		gender = sc.nextLine().charAt(0);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		age = Integer.parseInt(sc.nextLine());
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		height = Double.parseDouble(sc.nextLine());
		
		System.out.println("Ű " + height + "cm�� " + age + "�� " + gender + "�� " + name +"�� �ݰ����ϴ� ^^");
		
		
	}


}
