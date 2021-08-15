package note.ownpractice.star;

import java.util.Scanner;

public class Star {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 왼쪽에 붙은 삼각형 그리기 ");
		
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		
		for(int i = 1; i <= num; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
	
	public void practice2() {
		System.out.println("2. 왼쪽에 붙은 역삼각형 그리기");
		System.out.print("정수 : ");
		int num =Integer.parseInt(sc.nextLine());
		
		for(int i = num; i > 0; i--)
		{
			for(int j = i; j > 0; j --)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//첫 번째 숫자와 마지막 숫자를 생각해보자!
	}
	
	
	public void practice3() {
		System.out.println("3. 오른쪽에 붙은 삼각형 그리기");
		System.out.print("정수: ");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= num; i++)
		{
			for(int j = num; j > 0; j--)
			{
				if(j  > i )
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
	}
	
	public void practice4() {
		System.out.println("4. 오른쪽에 붙은 역삼각형 그리기");
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= num; i ++)
		{
			for(int j = 1; j <= num; j++)
			{
				if(j < i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		System.out.println("5. 왼쪽에 붙은 이등변삼각형 그리기");	//입력 숫자가 높이인
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= num; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			
			}
			System.out.println("");
		}
		
		for(int i = 1; i <= num; i++)
		{
			for(int j = num; j > i; j--)
			{
				System.out.print("*");
			}
				System.out.println("");
		}

		int j = num;
		//다른 방법은?
//		for(int i = 0; i <= num; i++)
//		{
//			if(i <= j)
//			{
//				
//			}
//			
//		}
	}
		public void practice6() {
			int iNum = 0;
			System.out.println("6. 정삼각형 그리기");

			System.out.print("정수 입력 : ");
			iNum = Integer.parseInt(sc.nextLine());

			for (int i = 1; i <= iNum; i++) {		//n개 추출
				for (int j = iNum; j > 0; j--) {
					if (i < j) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				for (int k = 1; k < i; k++) {		// n-1개 추출
					if (i > k) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
		}
		
		public void practice7() {
			System.out.println("7. 가운데가 빈 정사각형(가로 세로 별의 갯수가 같은) 그리기");
			
			
		}
		
	
	
}

