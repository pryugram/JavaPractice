package note.ownpractice.printNum;

import java.util.Scanner;

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
	
	

}
