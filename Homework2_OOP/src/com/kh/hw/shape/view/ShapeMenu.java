package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	private double inputNum;
	
	
	public void inputMenu() {
		System.out.println("===== ���� ���α׷� =====");
		System.out.println("3. �ﰢ��");
		System.out.println("4. �簢��");
		System.out.println("9. ���α׷� ����");
		
		while(true)
		{
			System.out.print("�޴� ��ȣ : ");
			inputNum = Integer.parseInt(sc.nextLine());
			
			
			if(inputNum == 9)
			{
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			else if(inputNum == 3)
			{
				triangleMenu();
				continue;
			}	
			else if(inputNum == 4) 
			{
				squareMenu();
				continue;
			}
			else
			{
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
		}
		
	}
		
		
		
	public void triangleMenu() {
		System.out.println("===== �ﰢ�� =====");
		System.out.println("1. �ﰢ�� ����");
		System.out.println("2. �ﰢ�� ��ĥ");
		System.out.println("3. �ﰢ�� ����");
		System.out.println("9. ��������");
		
		while(true)
		{
			System.out.print("�޴� ��ȣ : ");
			inputNum = Integer.parseInt(sc.nextLine());
			
			
			if(inputNum == 9)
			{
				System.out.println("�������� ���ư��ϴ�.");
				inputMenu();
			}
			else if(inputNum == 1)
			{
				inputSize(3,1);
			}
			else if(inputNum == 2)
			{
				inputSize(3,2);
			}
			else if(inputNum == 3)
			{
				inputSize(3,3);
			}
			else
			{
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
		}
		
		
	}
		
	public void squareMenu() {
		
		System.out.println("===== �簢�� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("3. �簢�� ��ĥ");
		System.out.println("4. �簢�� ����");
		System.out.println("9. ��������");
		
		while(true)
		{
			System.out.print("�޴� ��ȣ : ");
			inputNum = Integer.parseInt(sc.nextLine());
			
			
			if(inputNum == 9)
			{
				System.out.println("�������� ���ư��ϴ�.");
				inputMenu();
			}
			else if(inputNum == 1)
			{
				inputSize(4,1);
			}
			else if(inputNum == 2)
			{
				inputSize(4,2);
			}
			else if(inputNum == 3)
			{
				inputSize(4,3);
			}
			else if(inputNum == 4)
			{
				inputSize(4,4);
			}
			else
			{
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
				
			
			
		}
		
	}
	
	public void inputSize(int type, int menuNum) {
		if (type == 3)
		{
			if(menuNum == 1)
			{
				System.out.print("���� : ");
				double inputH = Double.parseDouble(sc.nextLine());
				
				System.out.print("�ʺ� : ");
				double inputW = Double.parseDouble(sc.nextLine()); 
				System.out.println("�ﰢ�� ���� : " + tc.calcaArea(inputH, inputW));
				
			}
			else if(menuNum == 2)
			{
				System.out.print("������ �Է��ϼ��� : ");
				String inputC = sc.nextLine();
				tc.paintColor(inputC);
				System.out.println("���� �����Ǿ����ϴ�.");
			}
			else if(menuNum == 3)
			{
				printInformation(3);
			}
		}	
		else if(type == 4)
		{
				if(menuNum == 1)
				{
					System.out.print("���� : ");
					double inputH = Double.parseDouble(sc.nextLine());
					
					System.out.print("�ʺ� : ");
					double inputW = Double.parseDouble(sc.nextLine()); 
					System.out.println("�簢�� �ѷ� : " + scr.calcPerimeter(inputH, inputW));
					
				}
				else if(menuNum == 2)
				{
					System.out.print("���� : ");
					double inputH = Double.parseDouble(sc.nextLine());
					
					System.out.print("�ʺ� : ");
					double inputW = Double.parseDouble(sc.nextLine()); 
					System.out.println("�簢�� ���� : " + scr.calcArea(inputH,inputW));
				}
				else if(menuNum == 3)
				{
					System.out.print("������ �Է��ϼ��� : ");
					String inputC = sc.nextLine();
					scr.paintColor(inputC);
					System.out.println("���� �����Ǿ����ϴ�.");
					
				}
				else if(menuNum == 4)
				{
					printInformation(4);
				}
		}
			
		
		
	}
	
	public void printInformation(int type) {
		if(type == 3)
		{
			System.out.println("�ﰢ�� ���� : " + tc.print());
		}
		else if(type ==4)
		{
			System.out.println("�簢�� ���� : " + scr.print());
		}
	}
	
	

}
