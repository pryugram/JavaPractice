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
			for(int j = 1; j <= i; j++)
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
		
		for(int i = num; i >= 1; i--)
		{
			for(int j = i; j <= i; j --)
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
		
		// if ���� �׷�����
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
		System.out.println("4. �����ʿ� ���� ���ﰢ�� �׸���");
		System.out.print("���� : ");
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
		
		//if ���� �׷�����
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
		System.out.println("5. ���ʿ� ���� �̵�ﰢ�� �׸���");	//�Է� ���ڰ� ������
		System.out.print("���� : ");							//������ ���̰� �Է� ���� ������
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
			System.out.println("6. �Ƕ�̵� �׸���");

			System.out.print("���� �Է� : ");
//			iNum = Integer.parseInt(sc.nextLine());

//			for (int i = 1; i <= iNum; i++) {		//n�� ����
//				for (int j = iNum; j > 0; j--) {
//					if (i < j) {
//						System.out.print(" ");
//					} else {
//						System.out.print("*");
//					}
//				}
//				for (int k = 1; k < i; k++) {		// n-1�� ����
//					if (i > k) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println();
//			}
			//�ٸ� ���
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
			System.out.println("7. ����� �� ���簢��(���� ���� ���� ������ ����) �׸���");
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
		
		public void practice8() {
			System.out.println("8. �� �׸���");
			System.out.print("���� �Է� : ");
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
			System.out.println("9. ������ �׸���");	//������
			System.out.print("���� �Է� : ");
			int num = Integer.parseInt(sc.nextLine());
			
			//�п� Ǯ��
			//7�� ��
			//��ܺ�(�Ƕ�̵�)	0 ~ 2�� 
//			for(int i = 0; i < num / 2; i++)
//			{
//				for(int j = num / 2; j > i; j--)	//���� ���(3 - 2 - 1)
//				{
//					System.out.print(" ");
//				}
//				for(int j = 0; j < i * 2 + 1; j++)	//�� ���(1 - 3 - 5)
//				{
//					System.out.print("*");
//				}
//				System.out.println("");
//			}
//			//�ϴܺ�(���Ƕ�̵�) 3 ~ 6��
//			for(int i = num / 2; i >= 0; i--)	
//			{
//				for(int j = num / 2; j > i; j--)		//���� ���(0 - 1 - 2 - 3)
//				{	
//					System.out.print(" ");
//				}
//				for(int j = 0; j < i * 2 + 1; j++)		//�� ���(7 - 5 - 3 - 1)
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
			System.out.println("10. �����ﰢ�� �׸���");
			System.out.print("���� �Է� : ");
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
			System.out.println("11. �𷡽ð� �׸���");
			System.out.print("���� �Է� : ");
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

