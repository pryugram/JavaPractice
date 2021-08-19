package note.ownpractice.printNum;

import java.util.Scanner;
import java.util.Random;

public class PrintNum {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 1부터 n까지 출력 프로그램");
		while(true)
		{
			System.out.print("정수 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num >= 1)
			{
				for(int i = 1; i <= num; i++)
				{
					System.out.printf("%d ", i);
				}
				break;
			}
				else
				{
					System.out.println("1 이상의 숫자를 다시 입력해주세요.");
					continue;
				}
		}
	}
	public void practice2() {
		System.out.println("2. 1부터 n까지 역으로 출력 프로그램");
		while(true)
		{
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num >= 1)
		{
			for(int i= num; i >= 1; i--)
			{
				System.out.printf("%d ", i);
			}
			break;
		}
		else
		{
			System.out.println("1 이상의 숫자를 다시 입력하세요.");
			continue;
		}
		}
	}
	
	public void practice3() {
		System.out.println("3. while을 이용해 1부터 n까지 합 출력 프로그램");
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		int i = 1;
		
		while(i <= num)
		{
			sum += i++;
//			sum = sum + i;
//			i++;
			
		}
		
		System.out.println("1부터 " + num + "까지의 합은 " + sum);
	}
	
	public void practice4() {
		System.out.println("4. while을 이용해 1부터 n까지의 수와 합 출력 프로그램");
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		int i = 1;
		
		while(i < num)
		{
			System.out.print(i + " + ");
			sum += i++;
			
		}
		
		System.out.print(num + " = " + (sum + num));
		
		//if 활용할 경우?
	}
	
	public void practice5() {
		System.out.println("5. if와 for문을 이용해 1부터 n까지의 수와 합 출력 프로그램");
		int sum = 0;
		int i = 0;
		
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		for(i = 1; i < num; i++)
		{
			System.out.print(i + " + ");
			sum += i;
		}
		
		if(i == num)
		{
			System.out.print(num);
			sum += num;
		}
		
		System.out.println(" = " + sum); 
	}
	
	public void practice6() {
		System.out.println("6. 1부터 n까지 100을 곱해 출력하는 프로그램");
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		int mul = 0;
		int sum = 0;
		for(int i = 1; i <= num; i++)
		{
			
			mul = i * 100;
			sum += mul;
			System.out.print(mul + " ");
		}
		System.out.println("\n" + sum);
	}
	
	public void practice7() {
		System.out.println("7. 숫자를 입력받아 글자 출력");
		
		while(true)
		{
			
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num < 0)
		{
			System.out.println("양수가 아닙니다.");
			continue;
		}
		else
		{
		for(int i = 0; i < num;i++)
		{
			if(i % 2 == 0)
			{
				System.out.print("박");
			}
			else if(i % 2 != 0)
			{
				System.out.print("수");
			}
		}
		System.out.println("");
		}
		}
	}
	
	public void practice8() {
		System.out.println("8. 문자열과 문자 입력 받아 문자가 포함된 개수 출력");
		
		while(true)
		{
		System.out.print("문자열 입력 : ");
		String str1 = sc.nextLine();
		System.out.print("문자 입력 : ");
		char str2 = sc.nextLine().charAt(0);
		

		int count = 0;
		for(int i = 0; i < str1.length(); i ++)
		{
			if(str1.charAt(i) == str2)
			{
				count++;
			}
		}
		System.out.println(str1 + "안에 포함된 " + str2 + "개수 : " + count);
		System.out.print("더 하시겠습니까?(y/n) : ");
		String str3 = sc.nextLine();
		if(str3.toUpperCase().charAt(0) == 'Y')
		{
			continue;
		}
		else if(str3.toUpperCase().charAt(0) == 'N')
		{
			break;
		}
		}
	}
	
	public void practice9() {
		System.out.println("9. 1부터 100사이의 정수 중 임의의 난수가 정해지고 사용자가 "
							+			 "난수를 맞추는데 몇 번만에 맞추는지 출력");
		Random rd = new Random();
		int count = 0;
		int result = rd.nextInt(100);
		while(true) 
		{
		System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
		int num = Integer.parseInt(sc.nextLine());
//		System.out.println(result);
		
		if(num > 0 && num < 100)
		{

			if(num > result)
			{
				System.out.println("DOWN!");
				count++;
				continue;

			} 
			else if(num < result)
			{
				System.out.println("UP!");
				count++;
				continue;

			}
			else if (num == result)
			{
				System.out.println("정답입니다!!");
				System.out.println(count + "회만에 맞추셨습니다.");
				break;
			}

		}
		else
		{
			System.out.println("1~ 100 사이의 숫자를 입력해주세요.");
			continue;
		}
		}
		
		//랜덤 숫자 생성 방법
		/*
		 * 1.Random
		 * Random random = new Random(number) -> 패턴이 존재하는 랜덤
		 * Random random = new Random(System.currentTimeMillis()); seed를 줘야 완벽한 랜덤을 보장
		 * System.out.println(random.nextInt());		그냥 가지고 올 때
		 * System.out.println(random.nextInt(100)); 	0 ~ 100까지 갖고 올 때
		 * System.out.println(random.nextGaussian())	통계에서 일정한 랜덤 범위를 줄 때
		 * System.out.println(random.nextDouble())	소수점 0.0 ~ 0.1 넥슨 확률 사기
		 * 
		 * 
		 * 2.Math.Random
		 * Math.random(number) : 소수점 1.0~ 0;		완벽한 랜덤인지 보장?
		 * 
		 * 
		 */
		
	}

	public void practice10() {
		System.out.println("10. 컴퓨터와 가위바위보 후 마지막에 총 전적 출력");
		int total = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		String name = null;
		String rps = null;
		
		System.out.print("당신의 이름을 입력해 주세요 : ");
		name = sc.nextLine();
		
		
		while(true)
		{
			
		System.out.print("가위바위보 : ");
		rps = sc.nextLine();
		int com = (int)(Math.random() * 3 + 1);	//컴퓨터 가위 = 1, 바위 = 2, 보 = 3 생성
		
		
		if(rps.equals("exit"))
		{
			System.out.println("총 전적 : " + total + "전 " + win + "승 " 
										+ draw + "무 " + lose + "패 ");
			break;
		}
		
		total++;
		
		switch(rps) 
		{
		case"가위" :
			if(com == 1)
			{
				System.out.println("비겼습니다.");
				draw++;
			} 
			else if(com == 2)
			{
				System.out.println("졌습니다ㅠ");
				lose++;
			}
			else
			{
				System.out.println("이겼습니다~");
				win++;
				
			}
			break;
		case"바위" :
			if(com == 1)
			{
				System.out.println("이겼습니다~");
				win++;
			} 
			else if(com == 2)
			{
				System.out.println("비겼습니다.");
				draw++;
			}
			else
			{
				System.out.println("졌습니다ㅠ");
				lose++;
			}
			break;
		case"보":
			if(com == 1)
			{
				System.out.println("졌습니다ㅠ");
				lose++;
			} 
			else if(com == 2)
			{
				System.out.println("이겼습니다~");
				win++;
			}
			else
			{
				System.out.println("비겼습니다.");
				draw++;
			}
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		}
	}
	
}
