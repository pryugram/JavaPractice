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
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		
		while(true)
		{
			System.out.print("메뉴 번호 : ");
			inputNum = Integer.parseInt(sc.nextLine());
			
			
			if(inputNum == 9)
			{
				System.out.println("프로그램을 종료합니다.");
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
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
		}
		
	}
		
		
		
	public void triangleMenu() {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		
		while(true)
		{
			System.out.print("메뉴 번호 : ");
			inputNum = Integer.parseInt(sc.nextLine());
			
			
			if(inputNum == 9)
			{
				System.out.println("메인으로 돌아갑니다.");
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
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
		}
		
		
	}
		
	public void squareMenu() {
		
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		
		while(true)
		{
			System.out.print("메뉴 번호 : ");
			inputNum = Integer.parseInt(sc.nextLine());
			
			
			if(inputNum == 9)
			{
				System.out.println("메인으로 돌아갑니다.");
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
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
				
			
			
		}
		
	}
	
	public void inputSize(int type, int menuNum) {
		if (type == 3)
		{
			if(menuNum == 1)
			{
				System.out.print("높이 : ");
				double inputH = Double.parseDouble(sc.nextLine());
				
				System.out.print("너비 : ");
				double inputW = Double.parseDouble(sc.nextLine()); 
				System.out.println("삼각형 면적 : " + tc.calcaArea(inputH, inputW));
				
			}
			else if(menuNum == 2)
			{
				System.out.print("색깔을 입력하세요 : ");
				String inputC = sc.nextLine();
				tc.paintColor(inputC);
				System.out.println("색이 수정되었습니다.");
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
					System.out.print("높이 : ");
					double inputH = Double.parseDouble(sc.nextLine());
					
					System.out.print("너비 : ");
					double inputW = Double.parseDouble(sc.nextLine()); 
					System.out.println("사각형 둘레 : " + scr.calcPerimeter(inputH, inputW));
					
				}
				else if(menuNum == 2)
				{
					System.out.print("높이 : ");
					double inputH = Double.parseDouble(sc.nextLine());
					
					System.out.print("너비 : ");
					double inputW = Double.parseDouble(sc.nextLine()); 
					System.out.println("사각형 면적 : " + scr.calcArea(inputH,inputW));
				}
				else if(menuNum == 3)
				{
					System.out.print("색깔을 입력하세요 : ");
					String inputC = sc.nextLine();
					scr.paintColor(inputC);
					System.out.println("색이 수정되었습니다.");
					
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
			System.out.println("삼각형 정보 : " + tc.print());
		}
		else if(type ==4)
		{
			System.out.println("사각형 정보 : " + scr.print());
		}
	}
	
	

}
