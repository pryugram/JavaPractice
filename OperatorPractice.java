package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() 
	{
		Scanner sc1 = new Scanner(System.in);
		int inum1;
		
		System.out.print("Integer : ");
		inum1 = Integer.parseInt(sc1.nextLine());
		
		String result = inum1 > 0 ? "Positive Number": "Not Positive Number";
		System.out.println(result);
	}
	public void practice2()
	{
		Scanner sc2 = new Scanner(System.in);
		int inum2;
		
		System.out.print("Integer: ");
		inum2 = Integer.parseInt(sc2.nextLine());
		
		if(inum2 > 0)
		{
			System.out.println("Positive Number");
		} else if(inum2 == 0) {
			System.out.println("0");
		}	else {
			System.out.println("Negative Number");
		}
		
	}
	public void practice3()
	{
		Scanner sc3 = new Scanner(System.in);
		int inum3;
		
		System.out.print("Integer : ");
		inum3 = Integer.parseInt(sc3.nextLine());
		
		String result = inum3 % 2 == 0? "Even Number" : "Odd Number";
		System.out.println(result);
	}
	public void practice4()
	{
		Scanner sc4 = new Scanner(System.in);
		int pNum, cNum;
		
		System.out.print("Number of People: ");
		pNum = Integer.parseInt(sc4.nextLine());
		System.out.print("Number of Candies: ");
		cNum = Integer.parseInt(sc4.nextLine());
		
		System.out.println("Candies per Person : " + cNum / pNum);
		System.out.println("Number of LeftOver : " + cNum % pNum);
	}
	public void practice5()
	{
		Scanner sc5 = new Scanner(System.in);
		String name;
		int grade, group, number;
		char gender;
		double points;
		
		System.out.print("Name : ");
		name = sc5.nextLine();
		System.out.print("Grade(Only number) : ");
		grade = Integer.parseInt(sc5.nextLine());
		System.out.print("Group(Only number) : ");
		group = Integer.parseInt(sc5.nextLine());
		System.out.print("Number(Only number) : ");
		number = Integer.parseInt(sc5.nextLine());
		System.out.print("Gender(M/F) : ");
		gender = sc5.nextLine().charAt(0);
		
		String result = gender == 'M'? "Male": "Female";
		System.out.print("Points(Input to the second decimal place) : ");
		points = Double.parseDouble(sc5.nextLine());
		System.out.println(grade + "학년 " + group +  "반 " + number + "번 " + name + " " + result + "학생의 성적은 " + points + "이다.");
	}
	public void practice6()
	{
		Scanner sc6 = new Scanner(System.in);
		int age;
		System.out.print("Age : ");
		age = Integer.parseInt(sc6.nextLine());
		if(age <= 13)
		{
			System.out.println("Children");
		} else if(age > 19) {
			System.out.println("Adult");
		}	else {
			System.out.println("Teenager");
		}
	}
	public void practice7()
	{
		Scanner sc7 = new Scanner(System.in);
		int ko, en, ma, sum;
		double avg;
		System.out.print("Koerean : ");
		ko = Integer.parseInt(sc7.nextLine());
		System.out.print("English : ");
		en = Integer.parseInt(sc7.nextLine());
		System.out.print("Mathematics : ");
		ma = Integer.parseInt(sc7.nextLine());
		
		sum = ko + en + ma;
		avg = sum / 3;
		System.out.println(sum);
		System.out.println(avg);
		
		if(ko >= 40 && en >= 40 && ma >= 40)
		{	
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
	public void practice8()
	{
		Scanner sc8 = new Scanner(System.in);
		char verNum;
		System.out.print("Input your verifying number(including -) : ");
		
		verNum = sc8.nextLine().charAt(7);
		if(verNum == '1')
		{
			System.out.println("Man");
		} else {
			System.out.println("Woman");
		}
		
	}
	public void practice9()
	{
		Scanner sc9 = new Scanner(System.in);
		int num1, num2,num3;

		System.out.print("Integer1 : ");
		num1 = Integer.parseInt(sc9.nextLine());
		
		System.out.print("Integer2 : ");
		num2 = Integer.parseInt(sc9.nextLine());
		
		System.out.print("Input : ");
		num3 = Integer.parseInt(sc9.nextLine());
		
		if(num1 < num2 && num3 > num1 && num3 <= num2)
		{
			System.out.println("false");
		} else {
			System.out.println("true");
		}
		
	}
	public void practice10()
	{
		Scanner sc10 = new Scanner(System.in);
		int inputN1, inputN2, inputN3;
		
		System.out.print("Input1 : ");
		inputN1 = Integer.parseInt(sc10.nextLine());
		
		System.out.print("Input2 : ");
		inputN2 = Integer.parseInt(sc10.nextLine());
		
		System.out.print("Input3 : ");
		inputN3 = Integer.parseInt(sc10.nextLine());
		
		String result = inputN1 == inputN2 && inputN1 == inputN3? "true" : "false";
		System.out.println(result);
	}
	public void practice11()
	{
		Scanner sc11 = new Scanner(System.in);
		int payA1, payB1, payC1;
		double payA2, payB2, payC2;
		System.out.print("Annual Payment of A : ");
		payA1 = Integer.parseInt(sc11.nextLine());
		System.out.print("Annual Payment of B : ");
		payB1 = Integer.parseInt(sc11.nextLine());
		System.out.print("Annual Payment of C : ");
		payC1 = Integer.parseInt(sc11.nextLine());
//		payA2 = Double.parseDouble(sc11.nextLine());
		payA2 = 1.4 * payA1;
		payB2 = 1.0 * payB1;
		payC2 = 1.15 * payC1;
		
		String result1 = payA2 >= 3000? "3000 이상" : "3000 미만";
		System.out.println("Payment of A / Payment + Incentive : " + payA1 + "/" + payA2);
		System.out.println(result1);
		
		String result2 = payB2 >= 3000? "3000 이상" : "3000 미만";
		System.out.println("Payment of B / Payment + Incentive : " + payB1 + "/" + payB2);
		System.out.println(result2);
		
		String result3 = payC2 >= 3000? "3000 이상" : "3000 미만";
		System.out.println("Payment of C / Payment + Incentive : " + payC1 + "/" +payC2);
		System.out.println(result3);
		
		sc11.close();
	}
}


