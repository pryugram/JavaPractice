package note.ownpractice.star;

import java.util.Scanner;

public class StarOwn {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. ���ʿ� ���� �ﰢ�� �׸��� ");	
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		
		for(int i = 1; i <= num; i++)			//1 ��° �ݺ��� : 1���� ��������
		{
			for(int j = 1; j <= i; j++)			// ��ø �ݺ��� : 1 ���� i���� -> i�� ���� �������� ���� ũ�⸸ŭ ����
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
		//���ʿ� ���� ������ �����ﰢ�� : ��ø���� ���� ��������� ������ ������ ����
		//���ﰢ���� ���ҹ������� 
	}
	
	public void practice2() {
		System.out.println("2. ���ʿ� ���� ���ﰢ�� �׸���");
		System.out.print("���� : ");
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
		System.out.println("3. �����ʿ� ���� �ﰢ�� �׸���");
		System.out.print("����: ");
		int num = Integer.parseInt(sc.nextLine());
		
//		for(int i = 1; i <= num; i++)				//���� Ȱ��
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
		//if ���� ����� ���� �Բ� ��� ->	*�� �����ʿ��� ����, 
//		->i ���� ���� ����, �̿� �°� *�� ����ϴ� j�� ���� ������ ������ ����
//		*�� ������ ������ ������ ����ؾ� �ϴµ�, ������ ũ��� ������ ����
//		�Է��� num�� ���� ���� -> i�� �����ϴ� ��ŭ, �׷��Ƿ� k ���� num�� �پ��� ����� ������ ����
//		���� �׸��� j�� ������ ������ ��
		
	}
	
	public void practice4() {
		System.out.println("4. �����ʿ� ���� ���ﰢ�� �׸���");
		System.out.print("���� : ");
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

		
		//�������̱⿡ i�� �پ���� �Ѵ�.
		for(int i = num; i >=1; i--)			
		{
			for(int k = 1; k <= num - i; k++)	// ������ k�� ���� �����ؾ� �Ѵ�, �� 0���� ����
			{
				System.out.print(" ");
			}
			for(int j = i; j>=1; j--)		// *�� �׸��� j�� i�� ���� ����������� �����Ѵ�.
			{
				System.out.print("*");
			}
			System.out.println();
		}
// 	������ �߿��ϴ�, �ڵ��� ������� ���
	}
	
	public void practice5() {
		System.out.println("5. ���ʿ� ���� �̵�ﰢ�� �׸���");	//�Էµ� ������ ������ ������
		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());
		//�����ϴٰ� �����ϴ� �ﰢ��
		//���ʿ� ���� ������
		//�����ϴ� �ﰢ��
		int height = num / 2 + 1;
		
		for(int i = 1; i <= height; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			 System.out.println();
		}
		//�����ϴ� �ﰢ��
		for(int i = height - 1; i >=1 ; i--)	//�ߺ����� �ʰ� height - 1
		{
			for(int j = i; j>=1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
// Ȧ���� �Է��� ���	
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
		System.out.println("6. �Ƕ�̵� �׸���");
		System.out.print("���� �Է� : ");
//		���� �������� �����غ���
//		1,3,5,7,9 -> Ȧ�� ������ ���� -> Ȧ�� = 2n - 1
//		i�� ��������� �Բ� ���� �׸��� j �� 2n- 1���� �����ؾ� �Ѵ�.
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
			for(int k = 1; k <= num - i; k++)		//	�����ϴ� k
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
	
//	i�� ������ ��	*������ ����������
//	for(int i = 1; i <=num; i ++)
//	{	//�����ϴ� i
//		for(int k = 1; k <= num - i; k++)
//		{
//			//�����ϴ� k
//		}
//		for(int j = 1; j <= i; j++)
//		{
//			//�����ϴ� j
//		}
//	}
//
//
//	i�� ������ ��	*������ ����������
//	for(int i = num; i >= 1; i--)
//	{
//		for(int j = i; j >= 1; j --)
//		{
//			�����ϴ� j
//		}
//		for(int k = 1; k  <= num - i; k++)
//		{
//			�����ϴ� k
//		}
//	}
//
//	i�� ������ �� 	*������ Ȧ�� ���� ������ ��
//	for(int i = 1; i <= num; i++)
//	{
//		for(int k = 1; k <= num - i; k++)
//		{
//			�����ϴ� k
//		}
//		for(int j = 1; j <= 2 * i - 1; j++)
//		{
//			�����ϴ� i
//		}
//	}
//
//	i�� ������ �� *������ Ȧ�� ���� ������ ��
//	for(int i = num; i >= 1; i--)
//	{
//		for(int k = 1; k<= num - i; k++;)
//		{
//			�����ϴ� k
//		}
//		for(int j = i; j >= 1; j--)
//		{
//			�����ϴ� i
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
