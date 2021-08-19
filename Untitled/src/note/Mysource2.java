package note;

import java.util.Scanner;

public class Mysource2 {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Mysource2 ms = new Mysource2();
//		ms.practice1();
//		ms.practice2();
//		ms.practice3();
//		ms.practice4();
//		ms.practice5();
//		ms.practice6();
		ms.practice7();
	
	}
	
	public void practice1() {
		System.out.println("=======================");
		/*
		 * 왼쪽에 붙은 삼각형 출력
		 */
		
		System.out.print("정수 입력 : ");
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
		System.out.println("=======================");
		/*
		 * 왼쪽에 붙은 역삼각형
		 */
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		
		for(int i = 0; i < num; i++)
		{
			for(int j = num; j > i; j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}
	
	
	public void practice3() {
		System.out.println("=======================");
		/*
		 * 오른쪽에 붙은 삼각형
		 * 1항: 공백 3개 별 1개
		 */
		
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= num; i++)
		{
			for(int j = num; j > 0; j--)
			{
				if(j <= i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		
		
	}
	
	public void practice4() {
		System.out.println("=======================");
		/*
		 * 오른쪽에 붙은 역삼각형
		 * 초항 : 별 4개
		 * 2항 : 공백 1개 별 3개
		 */
		
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i = 0;  i < num; i++)
		{
			for(int j = 1; j <= num; j++)
			{
				if(j > i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
					
			}
			
			System.out.println("");
		}
		
		
	}
	
	public void practice5() {
		System.out.println("=======================");
		/*
		 * 왼쪽에 붙은 이등변 삼각형		홀수만 입력 받아야하나?
		 * 5일 때 3이 높이
		 */
		
		System.out.print("홀수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
			
		for(int i = 1; i <= num; i++)
		{
			if(i <= num / 2 + 1)
			{
				for(int j = 0; j < i; j++)
				{
					System.out.print("*");
				}
			}
			else if(i > num / 2 + 1)
			{
				for(int j = i; j <= num; j++)
				{
					System.out.print("*");
				}
			}
			
			
			System.out.println("");
		}
	}
	
	public void practice6() {
		System.out.println("=======================");
		/*
		 * 정삼각형(피라미드)
		 * 입력값이 4일 때
		 * 		*
		 * 	   ***
		 * 	  *****
		 *   *******
		 *   인 형태
		 */
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= num; i++) 
		{											
			for (int j = num; j > 0; j--)			//n개 추출		 
			{										//		*
				if (i < j) {						//	   **	
					System.out.print(" ");			//	  ***	
				} else {
					System.out.print("*");
				}
			}
			for (int k = 1; k < i; k++) 
			{										// n-1개 추출
				if (i > k) {						//			
					System.out.print("*");			//			*
				} else {							//			**
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	
	public void practice7() {
		System.out.println("=======================");
		/*
		 * 가운데가 빈 직사각형
		 * 5를 넣었을 때
		 * *****
		 * *   *
		 * *   *
		 * *   *
		 * *****
		 */
		
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < 5; i++ )
		{
			System.out.print("*");
			for(int j = -3; j < 2 ; j++)
			{
					if(j != i)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
			}
			System.out.println(" ");
		}
		
		
	}
		
		
	


}
