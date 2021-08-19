package note.ownpractice.printNum;

import java.util.Scanner;
import java.util.Random;

public class PrintNum {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 1���� n���� ��� ���α׷�");
		while(true)
		{
			System.out.print("���� : ");
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
					System.out.println("1 �̻��� ���ڸ� �ٽ� �Է����ּ���.");
					continue;
				}
		}
	}
	public void practice2() {
		System.out.println("2. 1���� n���� ������ ��� ���α׷�");
		while(true)
		{
		System.out.print("���� : ");
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
			System.out.println("1 �̻��� ���ڸ� �ٽ� �Է��ϼ���.");
			continue;
		}
		}
	}
	
	public void practice3() {
		System.out.println("3. while�� �̿��� 1���� n���� �� ��� ���α׷�");
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		int i = 1;
		
		while(i <= num)
		{
			sum += i++;
//			sum = sum + i;
//			i++;
			
		}
		
		System.out.println("1���� " + num + "������ ���� " + sum);
	}
	
	public void practice4() {
		System.out.println("4. while�� �̿��� 1���� n������ ���� �� ��� ���α׷�");
		System.out.print("���� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		int sum = 0;
		int i = 1;
		
		while(i < num)
		{
			System.out.print(i + " + ");
			sum += i++;
			
		}
		
		System.out.print(num + " = " + (sum + num));
		
		//if Ȱ���� ���?
	}
	
	public void practice5() {
		System.out.println("5. if�� for���� �̿��� 1���� n������ ���� �� ��� ���α׷�");
		int sum = 0;
		int i = 0;
		
		System.out.print("���� : ");
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
	
	public void practice6() {
		System.out.println("6. 1���� n���� 100�� ���� ����ϴ� ���α׷�");
		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());
		int mul = 0;
		int sum = 0;
		for(int i = 1; i <= num; i++)
		{
			
			mul = i * 100;
			sum += mul;
			System.out.print(mul + " ");
		}
		System.out.println("\n" + sum);
	}
	
	public void practice7() {
		System.out.println("7. ���ڸ� �Է¹޾� ���� ���");
		
		while(true)
		{
			
		System.out.print("���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num < 0)
		{
			System.out.println("����� �ƴմϴ�.");
			continue;
		}
		else
		{
		for(int i = 0; i < num;i++)
		{
			if(i % 2 == 0)
			{
				System.out.print("��");
			}
			else if(i % 2 != 0)
			{
				System.out.print("��");
			}
		}
		System.out.println("");
		}
		}
	}
	
	public void practice8() {
		System.out.println("8. ���ڿ��� ���� �Է� �޾� ���ڰ� ���Ե� ���� ���");
		
		while(true)
		{
		System.out.print("���ڿ� �Է� : ");
		String str1 = sc.nextLine();
		System.out.print("���� �Է� : ");
		char str2 = sc.nextLine().charAt(0);
		

		int count = 0;
		for(int i = 0; i < str1.length(); i ++)
		{
			if(str1.charAt(i) == str2)
			{
				count++;
			}
		}
		System.out.println(str1 + "�ȿ� ���Ե� " + str2 + "���� : " + count);
		System.out.print("�� �Ͻðڽ��ϱ�?(y/n) : ");
		String str3 = sc.nextLine();
		if(str3.toUpperCase().charAt(0) == 'Y')
		{
			continue;
		}
		else if(str3.toUpperCase().charAt(0) == 'N')
		{
			break;
		}
		}
	}
	
	public void practice9() {
		System.out.println("9. 1���� 100������ ���� �� ������ ������ �������� ����ڰ� "
							+			 "������ ���ߴµ� �� ������ ���ߴ��� ���");
		Random rd = new Random();
		int count = 0;
		int result = rd.nextInt(100);
		while(true) 
		{
		System.out.print("1~100 ������ ������ ������ ���纸���� : ");
		int num = Integer.parseInt(sc.nextLine());
//		System.out.println(result);
		
		if(num > 0 && num < 100)
		{

			if(num > result)
			{
				System.out.println("DOWN!");
				count++;
				continue;

			} 
			else if(num < result)
			{
				System.out.println("UP!");
				count++;
				continue;

			}
			else if (num == result)
			{
				System.out.println("�����Դϴ�!!");
				System.out.println(count + "ȸ���� ���߼̽��ϴ�.");
				break;
			}

		}
		else
		{
			System.out.println("1~ 100 ������ ���ڸ� �Է����ּ���.");
			continue;
		}
		}
		
		//���� ���� ���� ���
		/*
		 * 1.Random
		 * Random random = new Random(number) -> ������ �����ϴ� ����
		 * Random random = new Random(System.currentTimeMillis()); seed�� ��� �Ϻ��� ������ ����
		 * System.out.println(random.nextInt());		�׳� ������ �� ��
		 * System.out.println(random.nextInt(100)); 	0 ~ 100���� ���� �� ��
		 * System.out.println(random.nextGaussian())	��迡�� ������ ���� ������ �� ��
		 * System.out.println(random.nextDouble())	�Ҽ��� 0.0 ~ 0.1 �ؽ� Ȯ�� ���
		 * 
		 * 
		 * 2.Math.Random
		 * Math.random(number) : �Ҽ��� 1.0~ 0;		�Ϻ��� �������� ����?
		 * 
		 * 
		 */
		
	}

	public void practice10() {
		System.out.println("10. ��ǻ�Ϳ� ���������� �� �������� �� ���� ���");
		int total = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		String name = null;
		String rps = null;
		
		System.out.print("����� �̸��� �Է��� �ּ��� : ");
		name = sc.nextLine();
		
		
		while(true)
		{
			
		System.out.print("���������� : ");
		rps = sc.nextLine();
		int com = (int)(Math.random() * 3 + 1);	//��ǻ�� ���� = 1, ���� = 2, �� = 3 ����
		
		
		if(rps.equals("exit"))
		{
			System.out.println("�� ���� : " + total + "�� " + win + "�� " 
										+ draw + "�� " + lose + "�� ");
			break;
		}
		
		total++;
		
		switch(rps) 
		{
		case"����" :
			if(com == 1)
			{
				System.out.println("�����ϴ�.");
				draw++;
			} 
			else if(com == 2)
			{
				System.out.println("�����ϴ٤�");
				lose++;
			}
			else
			{
				System.out.println("�̰���ϴ�~");
				win++;
				
			}
			break;
		case"����" :
			if(com == 1)
			{
				System.out.println("�̰���ϴ�~");
				win++;
			} 
			else if(com == 2)
			{
				System.out.println("�����ϴ�.");
				draw++;
			}
			else
			{
				System.out.println("�����ϴ٤�");
				lose++;
			}
			break;
		case"��":
			if(com == 1)
			{
				System.out.println("�����ϴ٤�");
				lose++;
			} 
			else if(com == 2)
			{
				System.out.println("�̰���ϴ�~");
				win++;
			}
			else
			{
				System.out.println("�����ϴ�.");
				draw++;
			}
			break;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
		}
	}
	
}
