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
		 * ���ʿ� ���� �ﰢ�� ���
		 */
		
		System.out.print("���� �Է� : ");
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
		 * ���ʿ� ���� ���ﰢ��
		 */
		System.out.print("���� �Է� : ");
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
		 * �����ʿ� ���� �ﰢ��
		 * 1��: ���� 3�� �� 1��
		 */
		
		System.out.print("���� �Է� : ");
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
		 * �����ʿ� ���� ���ﰢ��
		 * ���� : �� 4��
		 * 2�� : ���� 1�� �� 3��
		 */
		
		System.out.print("���� �Է� : ");
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
		 * ���ʿ� ���� �̵ �ﰢ��		Ȧ���� �Է� �޾ƾ��ϳ�?
		 * 5�� �� 3�� ����
		 */
		
		System.out.print("Ȧ�� �Է� : ");
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
		 * ���ﰢ��(�Ƕ�̵�)
		 * �Է°��� 4�� ��
		 * 		*
		 * 	   ***
		 * 	  *****
		 *   *******
		 *   �� ����
		 */
		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= num; i++) 
		{											
			for (int j = num; j > 0; j--)			//n�� ����		 
			{										//		*
				if (i < j) {						//	   **	
					System.out.print(" ");			//	  ***	
				} else {
					System.out.print("*");
				}
			}
			for (int k = 1; k < i; k++) 
			{										// n-1�� ����
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
		 * ����� �� ���簢��
		 * 5�� �־��� ��
		 * *****
		 * *   *
		 * *   *
		 * *   *
		 * *****
		 */
		
		System.out.print("���� �Է� : ");
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
