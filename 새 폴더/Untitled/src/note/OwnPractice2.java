package note;

import java.util.Scanner;

public class OwnPractice2 {
	
	private Scanner sc = new Scanner(System.in);
	private int inputNum = 0;
	
	
	public void inputMenu() {
		
		
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
				break;
			}
			else if(inputNum == 1)
			{
				System.out.println("1. �ﰢ�� ����");
				continue;
			}
		}
		
			
		
		
	}
	
	
	public static void main(String[] args) {
		OwnPractice2 op2 = new OwnPractice2();
		op2.inputMenu();
		
		
		
		
	}
}
