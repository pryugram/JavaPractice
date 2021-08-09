package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int num = 0;
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		num = Integer.parseInt(sc.nextLine());
		
		if(num < 1) 
		{
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}	else if (num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.printf("%d ", i);
			}
				
		}
		
		
	}
	
	public void practice2() {
		int num = 0;
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		num = Integer.parseInt(sc.nextLine());
	
		while(num < 1) {
			System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = Integer.parseInt(sc.nextLine());
		}
		if(num >= 1)  {
			for(int i = 1; i <= num; i++)
				System.out.printf("%d ", i);
			
		}
		
	}
	
	public void practice3() {
		
		int num = 0;
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		num = Integer.parseInt(sc.nextLine());
		
		if(num >=1) {
			
		for(int i = num; i >= 1; i--) {
			System.out.printf("%d ", i);
		}
		
		} else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice4() {
		
		int num = 0;
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		num = Integer.parseInt(sc.nextLine());

		while(num < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = Integer.parseInt(sc.nextLine());
		}
		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.printf("%d ",i);
			}
		}
		
	}

	public void practice5() {
		int i, num = 0;
		int sum = 0;
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		
		num = Integer.parseInt(sc.nextLine());
		
		for( i = 1; i < num; i++) {
				sum += i;
				System.out.print(i + " + ");
		} if(i == num) {
			System.out.print(num);
			sum += num;
		}
		
		System.out.println(" = " + sum);
	}
	
	public void practice6() {
		int num1, num2;
		System.out.print("ù ��° ���� : ");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("�� ��° ���� : ");
		num2 = Integer.parseInt(sc.nextLine());
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			
		} else if(num1 > num2) {
			for(int i = num2; i <= num1; i++) {
				System.out.printf("%d ",i);
			}
		} else if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				System.out.printf("%d ",i);
			}
		} 
		
		
	}
	
	public void practice7() {
		
		int num1 = 0, num2 = 0;
		System.out.print("ù ��° ���� : ");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("�� ��° ���� : ");
		num2 = Integer.parseInt(sc.nextLine());
		
		while(num1 <1 || num2 < 1)
			{
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				
			System.out.print("ù ��° ���� : ");
			num1 = Integer.parseInt(sc.nextLine());
			System.out.print("�� ��° ���� : ");
			num2 = Integer.parseInt(sc.nextLine());
			}
			
		if(num1 >= 1 && num2 >= 1)
		{
			if(num1 < num2)
			{
				for(int i = num1; i <= num2; i ++)
				{
					System.out.printf("%d ",i);
				}
			} 
			else
			{
				for(int i = num2; i <= num1; i ++)
				{
					System.out.printf("%d ",i);
				}
			}
		}
		
	}
	
	public void practice8() {
		int num = 0;
		System.out.print("���� : ");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.println("===== " + num + "�� =====");
		
		for(int i = 1; i <= 9; i++)
		{
			int total = num * i;
			System.out.println(num + " * " + i + " = " + total);
		}
		
	}
	
	public void practice9() {
		int num = 0;
		System.out.print("���� : ");
		num = Integer.parseInt(sc.nextLine());
		
		
		if(num > 9)
		{
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		}
//		else 
//		{
//			for(int i = num; i <= 9; i++)
//			{
//				System.out.println("===== " + i + "�� =====");
//				for(int j = 1; j <= 9; j++)
//				{
//					int total = i * j;
//					System.out.println(i + " * " + j + " = " + total);
//				}
//			}
//		}
		
		while(num<=9)
		{
				System.out.println("===== " + num + "�� =====");
				for(int i=1; i <10; i++) 
				{
					System.out.println(num + " * " + i + " = " + num*i);
				}
					num++;
		}
		
	}
	
	public void practice10() {
		int num = 0;
		System.out.print("���� : ");
		num = Integer.parseInt(sc.nextLine());
		
		while(num > 9)
		{
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
			System.out.print("���� : ");
			num = Integer.parseInt(sc.nextLine());
		}
		while(num <=9)
		{
			System.out.println("===== " + num + "�� =====");
			for(int i = 1; i <= 9; i++)
			{
				System.out.println(num + " * " + i + " = " + (num * i));
			} 
			num++;
		}
		
	}
	
	public void practice11() {
		int iNum, jNum;
		
		
		System.out.print("���� ���� : ");
		iNum = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		jNum = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < 10; i++)
		{
			System.out.printf("%d ",iNum);
			iNum += jNum;
		}
	}
	
	public void practice12() {
		// ���� �ΰ��� ������ �Է� > ��� ���
				// ������ �Է¿� exit�� ������ ���� �ȵ����� ���� ����
				// ������ / �̰� �� ��° ������ 0�̸� "0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���" ���
				// ���� ������ > "���� �������Դϴ�. �ٽ� �Է����ּ���"

				String op = null;
				int iNum = 0;
				int jNum = 0;

				System.out.println("\n------�ǽ� 12------");

				while (true) {
					System.out.print("������(+, -, *, /, %) : ");
					op = sc.nextLine();
					if (op.equals("exit")) {
						System.out.println("���α׷��� �����մϴ�.");
						break;
					}
					System.out.print("���� 1 : ");
					iNum = Integer.parseInt(sc.nextLine());
					System.out.print("���� 2 : ");
					jNum = Integer.parseInt(sc.nextLine());

					if ((op.equals("/") == true) && jNum == 0) {
						System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
						continue;
					} else {
						switch (op) {
						case "+":
							System.out.println(iNum + " + " + jNum + " = " + (iNum + jNum));
							continue;
						case "-":
							System.out.println(iNum + " - " + jNum + " = " + (iNum - jNum));
							continue;
						case "*":
							System.out.println(iNum + " * " + jNum + " = " + (iNum * jNum));
							continue;
						case "/":
							System.out.println(iNum + " / " + jNum + " = " + (iNum / jNum));
							continue;
						case "exit":
							System.out.println("���α׷��� �����մϴ�.");
							continue;
						default:
							System.out.println("���� ������ �Դϴ�. �ٽ� �Է����ּ���.");
							continue;
						}
					}
				}
		
	}
	
}



