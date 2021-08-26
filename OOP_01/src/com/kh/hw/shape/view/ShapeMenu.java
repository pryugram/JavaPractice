package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		
		while(true)
		{
		System.out.println("===== ���� ���α׷� =====");
		System.out.println("3. �ﰢ�� ");
		System.out.println("4. �簢�� ");
		System.out.println("9. ���α׷� ���� ");
		System.out.print("�޴� ��ȣ : ");
		int menuNum = Integer.parseInt(sc.nextLine());
		
		switch(menuNum)
			{
				case 3: triangleMenu(); break;
				case 4:	squareMenu(); break;
				case 9: System.out.println("���α׷� ����"); return;
				default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���."); continue;
			}		
		}
	}
	
	public void triangleMenu() {
		int type = 3;
		System.out.println("===== �ﰢ�� =====");
		System.out.println("1. �ﰢ�� ����");
		System.out.println("2. �ﰢ�� ��ĥ");
		System.out.println("3. �ﰢ�� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int menuNum = Integer.parseInt(sc.nextLine());
	
		
			switch(menuNum)
			{
				case 1 : inputSize(type, menuNum);
				case 2 : inputSize(type, menuNum);
				case 3 : printInformation(type);
				case 9 : System.out.println("�������� ���ư��ϴ�."); inputMenu();
				default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��� �ּ���."); return;
			}
	}
	
	public void squareMenu() {
		int type = 4;
		System.out.println("===== �簢�� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("3. �簢�� ��ĥ");
		System.out.println("4. �簢�� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int menuNum = Integer.parseInt(sc.nextLine());
		
		switch(menuNum)
		{
		case 1 : inputSize(type, menuNum);
		case 2 : inputSize(type, menuNum);
		case 3 : inputSize(type, menuNum);
		case 4 : printInformation(type);
		case 9 : System.out.println("�������� ���ư��ϴ�."); inputMenu();
		default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��� �ּ���."); return;
		}
		
		
	}
	
	public void inputSize(int type, int menuNum) {
		if( type == 3)
		{
			if(menuNum == 1)
			{
				
			System.out.print("���� : ");
			int height = Integer.parseInt(sc.nextLine());
			System.out.print("�ʺ� : ");
			int width = Integer.parseInt(sc.nextLine());
			System.out.println("�ﰢ�� ���� : " + tc.calcArea(height, width));
			}
			else if (menuNum == 2)
			{
				System.out.print("������ �Է��ϼ��� :");
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("���� �����Ǿ����ϴ�.");
			}
		}
		else if (type == 4)
		{
			if(menuNum == 1)
			{
				System.out.print("���� : ");
				int height = Integer.parseInt(sc.nextLine());
				System.out.print("�ʺ� : ");
				int width = Integer.parseInt(sc.nextLine());
				System.out.println("�簢�� �ѷ� : " + scr.calcPerimeter(height, width));
				
			}
			else if(menuNum == 2)
			{
				System.out.print("���� : ");
				int height = Integer.parseInt(sc.nextLine());
				System.out.print("�ʺ� : ");
				int width = Integer.parseInt(sc.nextLine());
				System.out.println("�簢�� ���� : " + scr.calcArea(height, width));
			}
			else if(menuNum == 3)
			{
				System.out.print("������ �Է��ϼ��� :");
				String color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("���� �����Ǿ����ϴ�.");
			}
		}
		
	}
	public void printInformation(int type) {
		if( type == 3)
		{
			tc.print();
		}
		else if( type == 4)
		{
			scr.print();
		}
		else
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		
		
	}
	
	
	
	

}
