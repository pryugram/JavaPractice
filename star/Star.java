package note.ownpractice.star;

import java.util.Scanner;

public class Star {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. ���ʿ� ���� �ﰢ�� �׸��� ");
		
		System.out.print("���� : ");
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
		System.out.println("2. ���ʿ� ���� ���ﰢ�� �׸���");
		System.out.print("���� : ");
		int num =Integer.parseInt(sc.nextLine());
		
		for(int i = num; i > 0; i--)
		{
			for(int j = i; j > 0; j --)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//ù ��° ���ڿ� ������ ���ڸ� �����غ���!
	}
	
	
	public void practice3() {
		System.out.println("3. �����ʿ� ���� �ﰢ�� �׸���");
		System.out.print("����: ");
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
		System.out.println("4. �����ʿ� ���� ���ﰢ�� �׸���");
		System.out.print("���� : ");
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
		System.out.println("5. ���ʿ� ���� �̵�ﰢ�� �׸���");	//�Է� ���ڰ� ������
		System.out.print("���� : ");
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
		//�ٸ� �����?
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
			System.out.println("6. ���ﰢ�� �׸���");

			System.out.print("���� �Է� : ");
			iNum = Integer.parseInt(sc.nextLine());

			for (int i = 1; i <= iNum; i++) {		//n�� ����
				for (int j = iNum; j > 0; j--) {
					if (i < j) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				for (int k = 1; k < i; k++) {		// n-1�� ����
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
			System.out.println("7. ����� �� ���簢��(���� ���� ���� ������ ����) �׸���");
			
			
		}
		
	
	
}

