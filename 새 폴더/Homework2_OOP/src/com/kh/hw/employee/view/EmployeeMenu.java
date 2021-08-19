package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
		Scanner sc = new Scanner(System.in);
		EmployeeController ec = new EmployeeController();
			
public EmployeeMenu() {

			while(true)
			{
			System.out.println("1. ��� �߰� ");
			System.out.println("2. ��� ���� ");
			System.out.println("3. ��� ���� ");
			System.out.println("4. ��� ��� ");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ�� �������� : ");
			int menuNumber = Integer.parseInt(sc.nextLine());

			if(menuNumber == 9)
			{
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			switch(menuNumber)
			{
			case 1 :
				insertEmp();
				continue;
			case 2 :
				updateEmp();
				continue; 
			case 3 :
				deleteEmp();
				continue;
			case 4 :
				printEmp();
				continue;
				
			default : 
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				continue;
				
			}
			
			
			}
			
			
	}
		
		public void insertEmp() {
				
			
			while(true)
			{
			System.out.print("��� ��ȣ : ");
			int inputInfoNum = Integer.parseInt(sc.nextLine());
			System.out.print("��� �̸� : ");
			String inputInfoName = sc.nextLine();
			System.out.print("��� ���� : ");
			char inputInfoGender = sc.nextLine().charAt(0);
			System.out.print("��ȭ ��ȣ : ");
			int inputInfoPhone = Integer.parseInt(sc.nextLine());
			
			System.out.print("�߰� ������ �� �Է��Ͻðڽ��ϱ�?(y/n) : ");
			String inputY = sc.nextLine();
			if(inputY.equals("y"))
				{
					System.out.print("��� �μ� : ");
					String inputDept = sc.nextLine();
					System.out.print("��� ���� : ");
					int inputSalary = Integer.parseInt(sc.nextLine());
					System.out.print("��� ���ʽ��� : ");
					int inputBonus = Integer.parseInt(sc.nextLine());
					ec.add(inputInfoPhone, inputInfoName, inputInfoGender, inputInfoName, 
							inputY, inputInfoPhone, inputInfoNum);
					
				}
			else
				{
				ec.add(inputInfoNum, inputInfoName, inputInfoGender, inputY);
				}
			
				break;
			}
			
			
		}
	
		public void updateEmp() {
			
			while(true)
			{
				System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�.");
				System.out.println("����� � ������ �����Ͻðڽ��ϱ�?");
				System.out.println("1. ��ȭ��ȣ");
				System.out.println("2. ��� ����");
				System.out.println("3. ���ʽ���");
				System.out.println("9. ���ư���");
			
			
				System.out.print("�޴� ��ȣ�� �������� : ");
				int inputMenuTwo = Integer.parseInt(sc.nextLine());
				
				if(inputMenuTwo == 9)
					{
						System.out.println("���θ޴��� ���ư��ϴ�");
						break;
					}
				switch(inputMenuTwo)
				{
					case 1:
						System.out.print("������ ��ȭ��ȣ : ");
						String updatePhone = sc.nextLine();
						ec.modify(updatePhone);
						break;
					case 2:
						System.out.print("������ ��� ���� : ");
						int updateSalary = Integer.parseInt(sc.nextLine());
						ec.modify(updateSalary);
						break;
					case 3:
						System.out.print("������ ���ʽ��� : ");
						double updateBonus = Double.parseDouble(sc.nextLine());
						ec.modify(updateBonus);
						break;
					default:
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						continue;
				} 
				
			}
		}
		
		public void deleteEmp() {
			
			while(true)
			{
			System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
			String askDelete = sc.nextLine();
			
			if(askDelete.charAt(0) == 'y')
			{	
				if(ec.inform() != null) 
				{
					ec.remove();
					System.out.println("������ ������ �����Ͽ����ϴ�.");
					break;
				}
				else if(ec.inform() == null)
				{
					System.out.println("������ ������ �����Ͽ����ϴ�.");
					break;
				}
			}
			System.out.println("���� �޴��� ���ư��ϴ�.");
			break;
			
			}
		}

			
		public void printEmp() {

			if(ec.inform() == null)
			{
				System.out.println("��� �����Ͱ� �����ϴ�.");
			}
			else
			{
				System.out.println(ec.inform());
			}
		
		}
	
}

