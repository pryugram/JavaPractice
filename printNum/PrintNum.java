package note.ownpractice.printNum;

import java.util.Scanner;

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
	
	

}
