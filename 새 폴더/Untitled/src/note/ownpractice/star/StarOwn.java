package note.ownpractice.star;

import java.util.Scanner;

public class StarOwn {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 왼쪽에 붙은 삼각형 그리기 ");	
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		
		for(int i = 1; i <= num; i++)			//1 번째 반복문 : 1부터 범위까지
		{
			for(int j = 1; j <= i; j++)			// 중첩 반복문 : 1 부터 i까지 -> i와 같은 방향으로 같은 크기만큼 성장
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
		//왼쪽에 붙은 정방향 직각삼각형 : 중첩문의 증감 진행방향을 증가로 같도록 설정
		//역삼각형은 감소방향으로 
	}
	
	public void practice2() {
		System.out.println("2. 왼쪽에 붙은 역삼각형 그리기");
		System.out.print("정수 : ");
		int num =Integer.parseInt(sc.nextLine());
		
		for(int i = num; i >= 1; i--)
		{
			for(int j = i; j >= 1; j --)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	
	public void practice3() {
		System.out.println("3. 오른쪽에 붙은 삼각형 그리기");
		System.out.print("정수: ");
		int num = Integer.parseInt(sc.nextLine());
		
//		for(int i = 1; i <= num; i++)				//공백 활용
//		{
//			for(int j = num; j > 0; j--)
//			{
//				if(j  > i )
//				{
//					System.out.print(" ");
//				}
//				else
//				{
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}
		
		for(int i = 1; i <= num; i++)
		{
			for(int k = 1; k <= num -i; k ++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		//if 없이 공백과 별을 함께 출력 ->	*이 오른쪽에서 증가, 
//		->i 값도 점차 증가, 이에 맞게 *을 출력하는 j와 증가 방향을 같도록 설정
//		*이 나오기 전에는 공백을 출력해야 하는데, 공백의 크기는 갈수록 감소
//		입력한 num도 점차 감소 -> i가 증가하는 만큼, 그러므로 k 또한 num이 줄어드는 방향과 같도록 설정
//		별을 그리는 j의 갯수를 생각할 것
		
	}
	
	public void practice4() {
		System.out.println("4. 오른쪽에 붙은 역삼각형 그리기");
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
//		for(int i = num; i <= num; i ++)
//		{
//			for(int j = 1; j <= num; j++)
//			{
//				if(j < i)
//				{
//					System.out.print(" ");
//				}
//				else
//				{
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

		
		//역방향이기에 i는 줄어들어야 한다.
		for(int i = num; i >=1; i--)			
		{
			for(int k = 1; k <= num - i; k++)	// 공백인 k가 먼저 증가해야 한다, 단 0부터 시작
			{
				System.out.print(" ");
			}
			for(int j = i; j>=1; j--)		// *을 그리는 j는 i와 같은 진행방향으로 감소한다.
			{
				System.out.print("*");
			}
			System.out.println();
		}
// 	순서도 중요하다, 코드의 진행방향 고려
	}
	
	public void practice5() {
		System.out.println("5. 왼쪽에 붙은 이등변삼각형 그리기");	//입력된 숫자의 절반이 높이인
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		//증가하다가 감소하는 삼각형
		//왼쪽에 붙은 정방향
		//증가하는 삼각형
		int height = num / 2 + 1;
		
		for(int i = 1; i <= height; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			 System.out.println();
		}
		//감소하는 삼각형
		for(int i = height - 1; i >=1 ; i--)	//중복되지 않게 height - 1
		{
			for(int j = i; j>=1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
// 홀수만 입력할 경우	
//	for(int i = 1; i <= num; i++)
//	{
//		for(int k =num; k >= num - i; k--)
//		{
//			System.out.print(" ");
//		}
//		for(int j = i; j <= 2 *num - 1; j++)
//		{
//			System.out.print("*");
//		}
//	}
	public void practice6() {
		System.out.println("6. 피라미드 그리기");
		System.out.print("정수 입력 : ");
//		별의 움직임을 유추해보자
//		1,3,5,7,9 -> 홀수 개수로 증가 -> 홀수 = 2n - 1
//		i의 증가방향과 함께 별을 그리는 j 는 2n- 1개씩 증가해야 한다.
		int num = Integer.parseInt(sc.nextLine());
		
//		for(int i = 1; i <= num; i++)
//			{
//				for(int k =1; k <= num - i; k++)
//				{
//					System.out.print(" ");
//				}
//				for(int j = i; j <= 2 *i - 1; j++)
//				{
//					System.out.print("*");
//				}
//				System.out.println();
//			}	
		
		for(int i = 1; i <=num; i ++)
		{
			for(int k = 1; k <= num - i; k++)		//	감소하는 k
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i -1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
//	i가 증가할 때	*개수가 정방향으로
//	for(int i = 1; i <=num; i ++)
//	{	//증가하는 i
//		for(int k = 1; k <= num - i; k++)
//		{
//			//감소하는 k
//		}
//		for(int j = 1; j <= i; j++)
//		{
//			//증가하는 j
//		}
//	}
//
//
//	i가 감소할 때	*개수가 역방향으로
//	for(int i = num; i >= 1; i--)
//	{
//		for(int j = i; j >= 1; j --)
//		{
//			감소하는 j
//		}
//		for(int k = 1; k  <= num - i; k++)
//		{
//			증가하는 k
//		}
//	}
//
//	i가 증가할 때 	*개수가 홀수 개씩 증가할 때
//	for(int i = 1; i <= num; i++)
//	{
//		for(int k = 1; k <= num - i; k++)
//		{
//			감소하는 k
//		}
//		for(int j = 1; j <= 2 * i - 1; j++)
//		{
//			증가하는 i
//		}
//	}
//
//	i가 감소할 때 *개수가 홀수 개씩 감소할 때
//	for(int i = num; i >= 1; i--)
//	{
//		for(int k = 1; k<= num - i; k++;)
//		{
//			증가하는 k
//		}
//		for(int j = i; j >= 1; j--)
//		{
//			감소하는 i
//		}
//	}
	
	
	public static void main(String[] args) {
		
		StarOwn so = new StarOwn();
//		so.practice1();
//		so.practice2();
//		so.practice3();
//		so.practice4();
//		so.practice5();
		so.practice6();
		
	}

}
