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
			for(int j = 1; j <= i; j++)
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
		
		for(int i = num; i >= 1; i--)
		{
			for(int j = i; j <= i; j --)
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
		
		// if 없이 그려보기
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= num; j ++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
	}
	
	public void practice4() {
		System.out.println("4. 오른쪽에 붙은 역삼각형 그리기");
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i = num; i <= num; i ++)
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
		
		//if 없이 그려보기
		for(int i = num; i >= 1; i--)
		{
			for(int j = 0; j < num; j ++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			
		}
		
		
	}
	
	public void practice5() {
		System.out.println("5. 왼쪽에 붙은 이등변삼각형 그리기");	//입력 숫자가 높이인
		System.out.print("정수 : ");							//원래는 높이가 입력 값의 절반인
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
		
		
		
	
	
	}
		public void practice6() {
			int iNum = 0;
			System.out.println("6. 피라미드 그리기");

			System.out.print("정수 입력 : ");
//			iNum = Integer.parseInt(sc.nextLine());

//			for (int i = 1; i <= iNum; i++) {		//n개 추출
//				for (int j = iNum; j > 0; j--) {
//					if (i < j) {
//						System.out.print(" ");
//					} else {
//						System.out.print("*");
//					}
//				}
//				for (int k = 1; k < i; k++) {		// n-1개 추출
//					if (i > k) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println();
//			}
			//다른 방법
			int num = Integer.parseInt(sc.nextLine());
			for (int i = 1; i <= num; i++)
			{
				for(int j = 1; j <= num - i; j++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= i * 2 -1; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		public void practice7() {
			System.out.println("7. 가운데가 빈 정사각형(가로 세로 별의 갯수가 같은) 그리기");
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
		
		public void practice8() {
			System.out.println("8. 원 그리기");
			System.out.print("정수 입력 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			for(int i = -num; i <= num; i++)
			{
				for(int j = -num; j <= num; j++)
				{
					if(i * i + j * j <= num * num)
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
		
		public void practice9() {
			System.out.println("9. 마름모 그리기");	//마름모
			System.out.print("정수 입력 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			//학원 풀이
			//7일 때
			//상단부(피라미드)	0 ~ 2행 
//			for(int i = 0; i < num / 2; i++)
//			{
//				for(int j = num / 2; j > i; j--)	//공백 출력(3 - 2 - 1)
//				{
//					System.out.print(" ");
//				}
//				for(int j = 0; j < i * 2 + 1; j++)	//별 출력(1 - 3 - 5)
//				{
//					System.out.print("*");
//				}
//				System.out.println("");
//			}
//			//하단부(역피라미드) 3 ~ 6행
//			for(int i = num / 2; i >= 0; i--)	
//			{
//				for(int j = num / 2; j > i; j--)		//공백 출력(0 - 1 - 2 - 3)
//				{	
//					System.out.print(" ");
//				}
//				for(int j = 0; j < i * 2 + 1; j++)		//별 출력(7 - 5 - 3 - 1)
//				{
//					System.out.print("*");
//				}
//				
//				System.out.println("");
//			}
			
			for (int i =1; i <= num; i++)
			{
				for (int j = 1; j <= num -i; j++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= i * 2 - 1; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i = num; i >= 1; i--)
			{
				for(int j = 0; j < num - i; j++)
				{
					System.out.print(" ");
				}
				for(int j =1; j <= 2 * i -1; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			
			
		}
		
		public void practice10() {
			System.out.println("10. 역정삼각형 그리기");
			System.out.print("정수 입력 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			for(int i = num; i >=1; i--)
			{
				for (int j = 0; j < num -1; j++)
				{
					System.out.print(" ");
				}
				for (int j = 1; j <= j * 2 - 1; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		public void practice11() {
			System.out.println("11. 모래시계 그리기");
			System.out.print("정수 입력 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			for(int i = num; i >= 1; i--)
			{
				for(int j = 0; j < num -i; j++)
				{
					System.out.print(" ");
				}
				for( int j =1; j <= i * 2 -1; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i = 1; i <= num; i++)
			{
				for (int j = 1; j <= num-1; j++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= i * 2 -1; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			

			
			
			
			
			
			
			
			
		}
	
}

