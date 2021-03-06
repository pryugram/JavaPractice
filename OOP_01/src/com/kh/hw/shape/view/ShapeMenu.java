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
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형 ");
		System.out.println("4. 사각형 ");
		System.out.println("9. 프로그램 종료 ");
		System.out.print("메뉴 번호 : ");
		int menuNum = Integer.parseInt(sc.nextLine());
		
		switch(menuNum)
			{
				case 3: triangleMenu(); break;
				case 4:	squareMenu(); break;
				case 9: System.out.println("프로그램 종료"); return;
				default : System.out.println("잘못된 번호입니다. 다시 입력해주세요."); continue;
			}		
		}
	}
	
	public void triangleMenu() {
		int type = 3;
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = Integer.parseInt(sc.nextLine());
	
		
			switch(menuNum)
			{
				case 1 : inputSize(type, menuNum);
				case 2 : inputSize(type, menuNum);
				case 3 : printInformation(type);
				case 9 : System.out.println("메인으로 돌아갑니다."); inputMenu();
				default : System.out.println("잘못된 번호입니다. 다시 입력해 주세요."); return;
			}
	}
	
	public void squareMenu() {
		int type = 4;
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = Integer.parseInt(sc.nextLine());
		
		switch(menuNum)
		{
		case 1 : inputSize(type, menuNum);
		case 2 : inputSize(type, menuNum);
		case 3 : inputSize(type, menuNum);
		case 4 : printInformation(type);
		case 9 : System.out.println("메인으로 돌아갑니다."); inputMenu();
		default : System.out.println("잘못된 번호입니다. 다시 입력해 주세요."); return;
		}
		
		
	}
	
	public void inputSize(int type, int menuNum) {
		if( type == 3)
		{
			if(menuNum == 1)
			{
				
			System.out.print("높이 : ");
			int height = Integer.parseInt(sc.nextLine());
			System.out.print("너비 : ");
			int width = Integer.parseInt(sc.nextLine());
			System.out.println("삼각형 면적 : " + tc.calcArea(height, width));
			}
			else if (menuNum == 2)
			{
				System.out.print("색깔을 입력하세요 :");
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			}
		}
		else if (type == 4)
		{
			if(menuNum == 1)
			{
				System.out.print("높이 : ");
				int height = Integer.parseInt(sc.nextLine());
				System.out.print("너비 : ");
				int width = Integer.parseInt(sc.nextLine());
				System.out.println("사각형 둘레 : " + scr.calcPerimeter(height, width));
				
			}
			else if(menuNum == 2)
			{
				System.out.print("높이 : ");
				int height = Integer.parseInt(sc.nextLine());
				System.out.print("너비 : ");
				int width = Integer.parseInt(sc.nextLine());
				System.out.println("사각형 면적 : " + scr.calcArea(height, width));
			}
			else if(menuNum == 3)
			{
				System.out.print("색깔을 입력하세요 :");
				String color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
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
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		
	}
	
	
	
	

}
