package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int num = 0;
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = Integer.parseInt(sc.nextLine());
		
		if(num < 1) 
		{
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}	else if (num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.printf("%d ", i);
			}
				
		}
		
		
	}
	
	public void practice2() {
		int num = 0;
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = Integer.parseInt(sc.nextLine());
	
		while(num < 1) {
			System.out.println("1이상의 숫자를 입력하세요.");
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = Integer.parseInt(sc.nextLine());
		}
		if(num >= 1)  {
			for(int i = 1; i <= num; i++)
				System.out.printf("%d ", i);
			
		}
		
	}
	
	public void practice3() {
		
		int num = 0;
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = Integer.parseInt(sc.nextLine());
		
		if(num >=1) {
			
		for(int i = num; i >= 1; i--) {
			System.out.printf("%d ", i);
		}
		
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice4() {
		
		int num = 0;
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = Integer.parseInt(sc.nextLine());

		while(num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			System.out.print("1이상의 숫자를 입력하세요 : ");
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
		System.out.print("정수를 하나 입력하세요 : ");
		
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
		System.out.print("첫 번째 숫자 : ");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("두 번째 숫자 : ");
		num2 = Integer.parseInt(sc.nextLine());
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
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
		System.out.print("첫 번째 숫자 : ");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("두 번째 숫자 : ");
		num2 = Integer.parseInt(sc.nextLine());
		
		while(num1 <1 || num2 < 1)
			{
			System.out.println("1 이상의 숫자를 입력해주세요.");
				
			System.out.print("첫 번째 숫자 : ");
			num1 = Integer.parseInt(sc.nextLine());
			System.out.print("두 번째 숫자 : ");
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
		System.out.print("숫자 : ");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.println("===== " + num + "단 =====");
		
		for(int i = 1; i <= 9; i++)
		{
			int total = num * i;
			System.out.println(num + " * " + i + " = " + total);
		}
		
	}
	
	public void practice9() {
		int num = 0;
		System.out.print("숫자 : ");
		num = Integer.parseInt(sc.nextLine());
		
		
		if(num > 9)
		{
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
//		else 
//		{
//			for(int i = num; i <= 9; i++)
//			{
//				System.out.println("===== " + i + "단 =====");
//				for(int j = 1; j <= 9; j++)
//				{
//					int total = i * j;
//					System.out.println(i + " * " + j + " = " + total);
//				}
//			}
//		}
		
		while(num<=9)
		{
				System.out.println("===== " + num + "단 =====");
				for(int i=1; i <10; i++) 
				{
					System.out.println(num + " * " + i + " = " + num*i);
				}
					num++;
		}
		
	}
	
	public void practice10() {
		int num = 0;
		System.out.print("숫자 : ");
		num = Integer.parseInt(sc.nextLine());
		
		while(num > 9)
		{
			System.out.println("9 이하의 숫자만 입력해주세요.");
			System.out.print("숫자 : ");
			num = Integer.parseInt(sc.nextLine());
		}
		while(num <=9)
		{
			System.out.println("===== " + num + "단 =====");
			for(int i = 1; i <= 9; i++)
			{
				System.out.println(num + " * " + i + " = " + (num * i));
			} 
			num++;
		}
		
	}
	
	public void practice11() {
		int iNum, jNum;
		
		
		System.out.print("시작 숫자 : ");
		iNum = Integer.parseInt(sc.nextLine());
		System.out.print("공차 : ");
		jNum = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < 10; i++)
		{
			System.out.printf("%d ",iNum);
			iNum += jNum;
		}
	}
	
	public void practice12() {
		// 정수 두개와 연산자 입력 > 결과 출력
				// 연산자 입력에 exit이 들어오면 종료 안들어오면 무한 루프
				// 연산자 / 이고 두 번째 정수가 0이면 "0으로 나눌 수 없습니다. 다시 입력해주세요" 출력
				// 없는 연산자 > "없는 연산자입니다. 다시 입력해주세요"

				String op = null;
				int iNum = 0;
				int jNum = 0;

				System.out.println("\n------실습 12------");

				while (true) {
					System.out.print("연산자(+, -, *, /, %) : ");
					op = sc.nextLine();
					if (op.equals("exit")) {
						System.out.println("프로그램을 종료합니다.");
						break;
					}
					System.out.print("정수 1 : ");
					iNum = Integer.parseInt(sc.nextLine());
					System.out.print("정수 2 : ");
					jNum = Integer.parseInt(sc.nextLine());

					if ((op.equals("/") == true) && jNum == 0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
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
							System.out.println("프로그램을 종료합니다.");
							continue;
						default:
							System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
							continue;
						}
					}
				}
		
	}
	
}



