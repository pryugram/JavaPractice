package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1()
	{
		
		System.out.println("1. Input");
		System.out.println("2. Modify");
		System.out.println("3. Inquiry");
		System.out.println("4. Delete");
		System.out.println("7. Quit");
		
		int num;
		System.out.print("Input the menu numbers : ");
		
		Scanner sc1 = new Scanner(System.in);
		num = Integer.parseInt(sc1.nextLine());
		
		switch(num) {
		case 1:
			System.out.println("This is Input.");
			break;
		case 2:
			System.out.println("This is Modify.");
			break;
		case 3:
			System.out.println("This is Inquiry.");
			break;
		case 4:
			System.out.println("This is Delete.");
			break;
		case 7:
			System.out.println("Program will be quit.");
			break;
		}
	}
	public void practice2()
	{
		Scanner sc2 = new Scanner(System.in);
		int inum;
		System.out.print("Put a one single number : ");
		
		inum = Integer.parseInt(sc2.nextLine());
		
		if (inum % 2 == 0 && inum > 0)
		{
			System.out.println("Even number");
		}	else if (inum % 2 != 0 && inum > 0) {
			System.out.println("Odd number");
		}	else {
			System.out.println("Put only positive numbers");
		}
	}
	public void pracitce3()
	{
		Scanner sc3 = new Scanner(System.in);
		int ko, ma, en, sum, avg;
		
		System.out.print("Korean scores : ");
		ko = Integer.parseInt(sc3.nextLine());
		
		System.out.print("Math scores : ");
		ma = Integer.parseInt(sc3.nextLine());
		
		System.out.print("English scores : ");
		en = Integer.parseInt(sc3.nextLine());
		
		sum = ko + ma + en;
		avg = (ko + ma + en) / 3;
		
		if(ko < 40 || ma < 40 || en < 40 ) {
			System.out.println("Failed.");
		} else if (avg < 60){
			System.out.println("Failed.");
		}
		System.out.println("Korean : " + ko);
		System.out.println("Mathematics : " + ma);
		System.out.println("English : " + en);
		System.out.println("Total : " + sum);
		System.out.println("Average : " + (double)avg);	//double
		System.out.println("Congratulations, You passed!");
	}
	public void practice4()
	{
		String season;
		int month = 0;
		
		System.out.print("Input integer between 1 to 12 : ");
		Scanner sc4 = new Scanner(System.in);
		month = Integer.parseInt(sc4.nextLine());
		
		switch(month) 
		{
		case 1 : case 2: case 12: 
			System.out.println("month of " + month + "is winter");
			break;
		case 3: case 4: case 5: 
			System.out.println("month of " + month + "is spring");
			break;
		case 6: case 7: case 8:
			System.out.println("month of " + month + "is summer");
			break;
		case 9: case 10: case 11:
			System.out.println("month of " + month + "is fall");
			break;
		default:
			System.out.println("month of " + month + "is input wrong");
			break;
		}
			
	}
		public void practice5()
		{
			String loginId = "ID";
			String loginPassword = "Password";
			
			String id = null;
			String password = null;
			
			System.out.print("ID : ");
			Scanner sc5 = new Scanner(System.in);
			id = sc5.nextLine();
			
			System.out.print("Password : ");
			password = sc5.nextLine();
			if(!id.equals(loginId))
			{
				System.out.println("You put wrong ID.");
			} else if  (!password.equals(loginPassword)) {
				System.out.println("You put wrong Password.");
			}	else {
				System.out.println("Signed in");
			}
			
		}
		public void practice6()
		{
			System.out.print("Put user grade to know range of permission: ");
			Scanner sc6 = new Scanner(System.in);
			String manager, user, nonUser;
			String input;
			
			manager = "manager";
			user = "user";
			nonUser = "non-user";
			input = sc6.nextLine();
			
			if(input.equals(manager))
			{
				System.out.println("managing users, managing posts, writing posts, writing comments, inquiring posts");
			} else if(input.equals(user)) {
				System.out.println("writing posts, inquiring posts, writing comments");
			} else {
				System.out.println("inquiring posts");
			}
		}
		public void practice7()
		{
			
			Scanner sc7 = new Scanner(System.in);
			double height = 0;
			double weight = 0;
			
			System.out.print("Put your height in meter : ");
			height = Double.parseDouble(sc7.nextLine());
			
			System.out.print("Put your weight in killogram : ");
			weight = Double.parseDouble(sc7.nextLine());
			
			double bmi = weight / (height * height);
			System.out.println(bmi);
			
			if(bmi < 18.5) 
			{
				System.out.println("Low weight");
			}else if(bmi < 23) 
			{
				System.out.println("Normal weight");
			}else if(bmi <25) 
			{
				System.out.println("Overweight");
			}else if(bmi < 30) 
			{
				System.out.println("Obesity");
			}else 
			{
				System.out.println("Extreme obesity");
			}
		}
		public void practice8()
		{
			
			Scanner sc8 = new Scanner(System.in);
			
			int input1, input2;
			String p = null;
			String mi = null;
			String t = null;
			String d = null;
			String m = null;
			
			String operator;
			System.out.print("Input operand1 : ");
			input1 = Integer.parseInt(sc8.nextLine());
			System.out.print("Input operand2 : ");
			input2 = Integer.parseInt(sc8.nextLine());
			System.out.print("Input operator : ");
			operator = sc8.nextLine();
			p = "+";
			mi = "-";
			t = "*";
			d = "/";
			m = "%";
			
			if(operator.equals(p))
			{
				System.out.println(input1 + " + " + input2 + " = " +(input1 + input2));
			}	
			else if(operator.equals(mi)) {
				System.out.println(input1 + " - " + input2 + " = " +(input1 - input2));
			}	
			else if(operator.equals(t)) {
				System.out.println(input1 + " * " + input2 + " = " +(input1 * input2));
			}	
			else if(operator.equals(d)) {
				System.out.println(input1 + " / " + input2 + " = " +(input1 / input2));
			}	
			else if(operator.equals(m)) {
				System.out.println(input1 + " % " + input2 + " = " +(input1 % input2));
			}	
			else {
				System.out.println("You put wrong, Program terminated.");
				return;
		   }
   	}
		public void practice9()
		{
		System.out.println("================= Result =================");
		
		Scanner sc9 = new Scanner(System.in);
		int midT, finalT, assign, attend;
		
		System.out.print("Midterm Score : ");	
		midT = Integer.parseInt(sc9.nextLine());
		System.out.print("Finalterm Score : ");	
		finalT = Integer.parseInt(sc9.nextLine());
		System.out.print("Assignments : ");	
		assign = Integer.parseInt(sc9.nextLine());
		System.out.print("Attendences : ");
		attend = Integer.parseInt(sc9.nextLine());
		
		double totalM = midT * 0.2;
		double totalF = finalT * 0.3;
		double totalA1 = assign * 0.3;
		double totalA2 = attend;
		double total = totalM + totalF + totalA1 + attend;
		
		
		if(total >= 70)
		{
			System.out.println("Midterm Score(20) : " + totalM);	
			System.out.println("Finalterm Score(30) : " + totalF);
			System.out.println("Assignments(30) : " + totalA1);	
			System.out.println("Attendences(20) : " + totalA2);
			System.out.println("Total score : " + total);
			System.out.println("PASS");
		}	
			else if((20 -attend) >= (20 * 0.3)) 
		{
			System.out.println("Fail [Under-attendance ] (" + attend + "/20)");
			
		}	
			else  {
				
			System.out.println("Midterm Score(20) : " + totalM);	
			System.out.println("Finalterm Score(30) : " + totalF);
			System.out.println("Assignments(30) : " + totalA1);	
			System.out.println("Attendences(20) : " + totalA2);
			System.out.println("Total score : " + total);
			System.out.println("Fail [Under-scores]");
			
			}
		}
		
		public void practice10()
		{
			System.out.println("Choose the function.");
			System.out.println("1. Output Menu");
			System.out.println("2. Even / Odd number");
			System.out.println("3. Pass / Fail");
			System.out.println("4. Season");
			System.out.println("5. Sign in");
			System.out.println("6. Verify Permission");
			System.out.println("7. BMI");
			System.out.println("8. Calculator");
			System.out.println("9. P/F");
			
			Scanner sc10 = new Scanner(System.in);
			
			int num;
			
			System.out.print("Choose : ");
			num = Integer.parseInt(sc10.nextLine());
			
			switch(num)
			{
			case 1: 
				practice1();
				break;
			case 2: 
				practice2();
				break;
			case 3: 
				pracitce3();
				break;
			case 4: 
				practice4();
				break;
			case 5: 
				practice5();
				break;
			case 6: 
				practice6();
				break;
			case 7: 
				practice7();
				break;
			case 8: 
				practice8();
				break;
			case 9: 
				practice9();
				break;
			default :
				practice10();
				break;
			}
		}
		public void practice11()
		{
		Scanner sc11 = new Scanner(System.in);
		String password;
		char passwordChar;
		
		System.out.print("Input Password(1000~9999) : ");
		password = sc11.nextLine();
			if(password.length() == 4)
			{
				char str1 = password.charAt(0);
				char str2 = password.charAt(1);
				char str3 = password.charAt(2);
				char str4 = password.charAt(3);
				if (str1 == str2 || str1 == str3 || str1 == str4 || str2 == str3 || str2 == str4 || str3 == str4)
				{
					System.out.println("Failed");	
				}
				else {
						System.out.println("Successed");
					}
			}
				else {
				System.out.println("Incorrect number of numbers ");
			}
		}
}


