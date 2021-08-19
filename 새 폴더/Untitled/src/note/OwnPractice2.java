package note;

import java.util.Scanner;

public class OwnPractice2 {
	
	private Scanner sc = new Scanner(System.in);
	private int inputNum = 0;
	
	
	public void inputMenu() {
		
		
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
				break;
			}
			else if(inputNum == 1)
			{
				System.out.println("1. 삼각형 면적");
				continue;
			}
		}
		
			
		
		
	}
	
	
	public static void main(String[] args) {
		OwnPractice2 op2 = new OwnPractice2();
		op2.inputMenu();
		
		
		
		
	}
}
