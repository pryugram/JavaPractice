package note;

import java.util.Random;
import java.util.Scanner;

public class MySource {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		MySource ms = new MySource();
//		ms.printNumber1();
//		ms.printNumber2();
//		ms.printNumber3();
//		ms.printNumber4();
//		ms.printNumber5();
//		ms.printNumber6();
//		ms.printNumber7();
		ms.printNumber8();
		
	}
	
	public void printNumber1() {
		System.out.println("==========================");
		/*	1부터 입력받은 숫자까지 출력, 1 미만의 숫자 입력 시 다시 값을 입력하도록
		 * 	
		 */
		while(true)
		{
			System.out.print("숫자를 입력하시오 : ");
			int num = Integer.parseInt(sc.nextLine());
			if(num < 1)
				{
					System.out.println("다시 입력하세요.");
					continue;
				}
			
			for(int i = 1; i <= num; i++)
				{
					System.out.print(i + " ");
				}
			break;
		
		}
	}
	
	public void printNumber2() {
		System.out.println("==========================");
		/*	1부터 입력받은 숫자까지 역으로 출력, 1 미만의 숫자 입력 시 다시 값을 입력하도록
		 * 	
		 */
		while(true)
			{
				System.out.print("숫자를 입력하시오 : ");
				int num = Integer.parseInt(sc.nextLine());
				if(num < 1)
					{
						System.out.println("1 이상의 숫자를 입력하세요.");
						continue;
					}
				
				for(int i = num; i >= 1; i--)
					{
						System.out.print(i + " ");
					}
				break;
			}
	}
		
		public void printNumber3() {
			System.out.println("==========================");
			/*	while 문을 이용해 1부터 n까지 합과 숫자들 출력 프로그램
			 */
			
			while(true)
				{
					System.out.print("숫자를 입력하세요 : ");
					int num = Integer.parseInt(sc.nextLine());
					int sum = 0;
					
					if(num < 1)
					{
						System.out.println("다시 입력해주세요.");
						continue;
					}
					
					for(int i = 1; i <= num; i++)
						{
							if(i < num)
							{
								System.out.print(i + " + ");
							}
							else
							{
								System.out.print(i + " = ");
							}
							sum += i;
						}
					
					System.out.print(" " + sum);
					break;
				}
			
		}
		
		public void printNumber4() {
			System.out.println("==========================");
			/*
			 * 1부터 n까지 100을 곱해 출력하는 프로그램
			 */
			
			while(true)
				{
					System.out.print("정수를 입력하세요 : ");
					int num = Integer.parseInt(sc.nextLine());
					int mul = 0;
					
					
					if(num < 1)
						{
							System.out.println("다시 입력하세요.");
							continue;
						}
					
					for(int i = 1; i <= num; i ++)
						{
							mul = i * 100;
							System.out.print(mul + " ");
						}
					break;
				}
			
		}
			
		public void printNumber5() {
			System.out.println("==========================");
			/*
			 * 양수를 입력 받아 '박' 또는 '수' 출력
			 * 양수가 아니면 다시 입력
			 */
			
			while(true)
			{
				System.out.print("양수를 입력하세요 : ");
				int num = Integer.parseInt(sc.nextLine());
				
				if(num < 0)
				{
					System.out.println("다시 입력하세요.");
					continue;
				}
				
				for(int i = 0; i < num; i ++)
				{
					if(i % 2 == 0)
					{
						System.out.print("박");
					}
					else 
					{
						System.out.print("수");
					}
				}
				break;
			}
			
			
			
		}
		
		
		public void printNumber6() {
			System.out.println("==========================");
			/*
			 * 문자열과 문자를 입력 받아 문자열에서 문자를 검색하여 포함된 문자의 개수를 출력
			 * (y/n)
			 */
			
			while(true)
				{
					System.out.print("문자열을 입력하시오 : ");
					String str = sc.nextLine();
					System.out.print("문자를 입력하시오 : ");
					char cha = sc.nextLine().charAt(0);
					
					int count = 0;
					for(int i = 0; i < str.length(); i++)
					{
						if(str.charAt(i) == cha)
						{
							count++;
						}
						
					}
					System.out.println("개수 : " + count + "개");
					System.out.print("더 하시겠습니까?(y/n) : ");
					String yesNo = sc.nextLine();
					
					if(yesNo.toUpperCase().charAt(0) == 'Y')
					{
						continue;
					}
					else if(yesNo.toUpperCase().charAt(0) == 'N')
					{
						break;
					}
				}
		}
		
		public void printNumber7() {
			System.out.println("==========================");
			/*
			 * 1부터 100 사이의 정수 중 임의의 난수가 정해지고 사용자가 난수를 맞추는데 몇 번만에 맞추는지 출력
			 * UP and Down
			 */
//			Random random = new Random();
			int randomNum = (int)(Math.random() * 100 + 1);
			int count = 0;

			while(true)
			{
			System.out.print("숫자를 입력하세요 : ");
			int number = Integer.parseInt(sc.nextLine());
			System.out.println(randomNum);
			
//			random.nextInt(100);
			
			if(number < 100 && number > 0)
			{
				if(number> randomNum)
				{
					System.out.println("Down!");
					count++;
					continue;
				}
				else if(number < randomNum)
					{
						System.out.println("UP!");
						count++;
						continue;
					}
				else if(number == randomNum)
					{
						System.out.println("시도 횟수 : " + count);
						break;
					}
					
			}
			else
			{
				System.out.println("숫자를 다시 입력하세요.");
				continue;
				
			}
			}
		}
		
		public void printNumber8() {
			System.out.println("==========================");
			/*
			 * 컴퓨터랑 가위바위보 until 'exit' , 'exit' 받으면 총 결과 출력
			 */
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			int draw = 0;
			int win = 0;
			int lose = 0;
			int total = 0;
			while(true)
				{
				System.out.print("가위바위보 : ");
				String user = sc.nextLine();
				int computer = (int) (Math.random() * 3 + 1);
				if(user.equals("exit"))		//equals와 ==의 차이점?
				{
					System.out.println(total + "전" + win + "승" + draw + "무" + lose + "패");
					break;
				}
				
				total++;
				
				switch(user)
				{
				case "가위" :
					if(computer == 1)
					{
						System.out.println("컴퓨터 : 가위");
						System.out.println(name + " : 가위");
						draw++;
						
					}
					else if(computer == 2)
					{
					System.out.println("컴퓨터 : 바위");
					System.out.println(name + " : 가위");
					lose++;
					}
					else if(computer == 3)
					{
						System.out.println("컴퓨터 : 보");
						System.out.println(name + " : 가위");
						win++;
					}
					break;
				case "바위" :
					if(computer == 1)
					{
						System.out.println("컴퓨터 : 가위");
						System.out.println(name + " : 바위");
						win++;
						
					}
					else if(computer == 2)
					{
						System.out.println("컴퓨터 : 바위");
						System.out.println(name + " : 바위");
						draw++;
					}
					else if(computer == 3)
					{
						System.out.println("컴퓨터 : 보");
						System.out.println(name + " : 바위");
						lose++;
					}
					break;
				case "보" :
					if(computer == 1)
					{
						System.out.println("컴퓨터 : 가위");
						System.out.println(name + " : 보");
						lose++;
						
					}
					else if(computer == 2)
					{
						System.out.println("컴퓨터 : 바위");
						System.out.println(name + " : 보");
						win++;
					}
					else if(computer == 3)
					{
						System.out.println("컴퓨터 : 보");
						System.out.println(name + " : 보");
						draw++;
					}
					break;
				default : 
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				}
				}
			
}
