package note;

import java.util.Random;
import java.util.Scanner;

public class MySource {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		MySource ms = new MySource();
//		ms.printNumber1();
//		ms.printNumber2();
//		ms.printNumber3();
//		ms.printNumber4();
//		ms.printNumber5();
//		ms.printNumber6();
//		ms.printNumber7();
		ms.printNumber8();
		
	}
	
	public void printNumber1() {
		System.out.println("==========================");
		/*	1���� �Է¹��� ���ڱ��� ���, 1 �̸��� ���� �Է� �� �ٽ� ���� �Է��ϵ���
		 * 	
		 */
		while(true)
		{
			System.out.print("���ڸ� �Է��Ͻÿ� : ");
			int num = Integer.parseInt(sc.nextLine());
			if(num < 1)
				{
					System.out.println("�ٽ� �Է��ϼ���.");
					continue;
				}
			
			for(int i = 1; i <= num; i++)
				{
					System.out.print(i + " ");
				}
			break;
		
		}
	}
	
	public void printNumber2() {
		System.out.println("==========================");
		/*	1���� �Է¹��� ���ڱ��� ������ ���, 1 �̸��� ���� �Է� �� �ٽ� ���� �Է��ϵ���
		 * 	
		 */
		while(true)
			{
				System.out.print("���ڸ� �Է��Ͻÿ� : ");
				int num = Integer.parseInt(sc.nextLine());
				if(num < 1)
					{
						System.out.println("1 �̻��� ���ڸ� �Է��ϼ���.");
						continue;
					}
				
				for(int i = num; i >= 1; i--)
					{
						System.out.print(i + " ");
					}
				break;
			}
	}
		
		public void printNumber3() {
			System.out.println("==========================");
			/*	while ���� �̿��� 1���� n���� �հ� ���ڵ� ��� ���α׷�
			 */
			
			while(true)
				{
					System.out.print("���ڸ� �Է��ϼ��� : ");
					int num = Integer.parseInt(sc.nextLine());
					int sum = 0;
					
					if(num < 1)
					{
						System.out.println("�ٽ� �Է����ּ���.");
						continue;
					}
					
					for(int i = 1; i <= num; i++)
						{
							if(i < num)
							{
								System.out.print(i + " + ");
							}
							else
							{
								System.out.print(i + " = ");
							}
							sum += i;
						}
					
					System.out.print(" " + sum);
					break;
				}
			
		}
		
		public void printNumber4() {
			System.out.println("==========================");
			/*
			 * 1���� n���� 100�� ���� ����ϴ� ���α׷�
			 */
			
			while(true)
				{
					System.out.print("������ �Է��ϼ��� : ");
					int num = Integer.parseInt(sc.nextLine());
					int mul = 0;
					
					
					if(num < 1)
						{
							System.out.println("�ٽ� �Է��ϼ���.");
							continue;
						}
					
					for(int i = 1; i <= num; i ++)
						{
							mul = i * 100;
							System.out.print(mul + " ");
						}
					break;
				}
			
		}
			
		public void printNumber5() {
			System.out.println("==========================");
			/*
			 * ����� �Է� �޾� '��' �Ǵ� '��' ���
			 * ����� �ƴϸ� �ٽ� �Է�
			 */
			
			while(true)
			{
				System.out.print("����� �Է��ϼ��� : ");
				int num = Integer.parseInt(sc.nextLine());
				
				if(num < 0)
				{
					System.out.println("�ٽ� �Է��ϼ���.");
					continue;
				}
				
				for(int i = 0; i < num; i ++)
				{
					if(i % 2 == 0)
					{
						System.out.print("��");
					}
					else 
					{
						System.out.print("��");
					}
				}
				break;
			}
			
			
			
		}
		
		
		public void printNumber6() {
			System.out.println("==========================");
			/*
			 * ���ڿ��� ���ڸ� �Է� �޾� ���ڿ����� ���ڸ� �˻��Ͽ� ���Ե� ������ ������ ���
			 * (y/n)
			 */
			
			while(true)
				{
					System.out.print("���ڿ��� �Է��Ͻÿ� : ");
					String str = sc.nextLine();
					System.out.print("���ڸ� �Է��Ͻÿ� : ");
					char cha = sc.nextLine().charAt(0);
					
					int count = 0;
					for(int i = 0; i < str.length(); i++)
					{
						if(str.charAt(i) == cha)
						{
							count++;
						}
						
					}
					System.out.println("���� : " + count + "��");
					System.out.print("�� �Ͻðڽ��ϱ�?(y/n) : ");
					String yesNo = sc.nextLine();
					
					if(yesNo.toUpperCase().charAt(0) == 'Y')
					{
						continue;
					}
					else if(yesNo.toUpperCase().charAt(0) == 'N')
					{
						break;
					}
				}
		}
		
		public void printNumber7() {
			System.out.println("==========================");
			/*
			 * 1���� 100 ������ ���� �� ������ ������ �������� ����ڰ� ������ ���ߴµ� �� ������ ���ߴ��� ���
			 * UP and Down
			 */
//			Random random = new Random();
			int randomNum = (int)(Math.random() * 100 + 1);
			int count = 0;

			while(true)
			{
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int number = Integer.parseInt(sc.nextLine());
			System.out.println(randomNum);
			
//			random.nextInt(100);
			
			if(number < 100 && number > 0)
			{
				if(number> randomNum)
				{
					System.out.println("Down!");
					count++;
					continue;
				}
				else if(number < randomNum)
					{
						System.out.println("UP!");
						count++;
						continue;
					}
				else if(number == randomNum)
					{
						System.out.println("�õ� Ƚ�� : " + count);
						break;
					}
					
			}
			else
			{
				System.out.println("���ڸ� �ٽ� �Է��ϼ���.");
				continue;
				
			}
			}
		}
		
		public void printNumber8() {
			System.out.println("==========================");
			/*
			 * ��ǻ�Ͷ� ���������� until 'exit' , 'exit' ������ �� ��� ���
			 */
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			int draw = 0;
			int win = 0;
			int lose = 0;
			int total = 0;
			while(true)
				{
				System.out.print("���������� : ");
				String user = sc.nextLine();
				int computer = (int) (Math.random() * 3 + 1);
				if(user.equals("exit"))		//equals�� ==�� ������?
				{
					System.out.println(total + "��" + win + "��" + draw + "��" + lose + "��");
					break;
				}
				
				total++;
				
				switch(user)
				{
				case "����" :
					if(computer == 1)
					{
						System.out.println("��ǻ�� : ����");
						System.out.println(name + " : ����");
						draw++;
						
					}
					else if(computer == 2)
					{
					System.out.println("��ǻ�� : ����");
					System.out.println(name + " : ����");
					lose++;
					}
					else if(computer == 3)
					{
						System.out.println("��ǻ�� : ��");
						System.out.println(name + " : ����");
						win++;
					}
					break;
				case "����" :
					if(computer == 1)
					{
						System.out.println("��ǻ�� : ����");
						System.out.println(name + " : ����");
						win++;
						
					}
					else if(computer == 2)
					{
						System.out.println("��ǻ�� : ����");
						System.out.println(name + " : ����");
						draw++;
					}
					else if(computer == 3)
					{
						System.out.println("��ǻ�� : ��");
						System.out.println(name + " : ����");
						lose++;
					}
					break;
				case "��" :
					if(computer == 1)
					{
						System.out.println("��ǻ�� : ����");
						System.out.println(name + " : ��");
						lose++;
						
					}
					else if(computer == 2)
					{
						System.out.println("��ǻ�� : ����");
						System.out.println(name + " : ��");
						win++;
					}
					else if(computer == 3)
					{
						System.out.println("��ǻ�� : ��");
						System.out.println(name + " : ��");
						draw++;
					}
					break;
				default : 
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue;
				}
				}
				}
			
}
