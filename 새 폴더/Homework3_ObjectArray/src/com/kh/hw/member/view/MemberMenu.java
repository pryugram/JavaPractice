package com.kh.hw.member.view;

import java.util.Scanner;
import com.kh.hw.member.controller.MemberController;

public class MemberMenu {

		Scanner sc = new Scanner(System.in);
		MemberController mc = new MemberController();

		public MemberMenu () {	//�⺻ ������
			
			
		}
		
		public void mainMenu() {	//���� �޴� ��� �޼ҵ�
//			System.out.println("�ִ� ��� ������ ȸ�� ���� " + size + "���Դϴ�.");
//			System.out.println("���� ��ϵ� ȸ�� ���� " + mc.existMemberNum() + "���Դϴ�.");
//			mc.m[];	//mc Ŭ���� ���� ��� �ʵ� �̿�
			
			//���� ȸ�� ���� 10���� �ƴ� ��
			
			while(true)				
			{
				
			System.out.println("1. �� ȸ�� ���");
			System.out.println("2. ȸ�� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ��� ���");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int inputMenuNum = Integer.parseInt(sc.nextLine());
			int inputMemberNum = Integer.parseInt(sc.nextLine());
			
			
			if(inputMemberNum != 10)	//	ȸ�� ���� 10���� �ƴ� ��
			{
				
			switch(inputMenuNum)
			{
				case 1:
					insertMember();
				case 2:
					searchMember();
				case 3:
					updateMember();
				case 4:
					deleteMember();
				case 5:
					printAll();
				case 9:
					System.out.println("");
					break;
				default :
					System.out.println("�߸� �����̽��ϴ�.");
					continue;
			}
			}
			else
			{
				switch(inputMenuNum)
				{
				case 2:
					searchMember();
				case 3:
					updateMember();
				case 4:
					deleteMember();
				case 5:
					printAll();
				case 9:
					break;
				default :
					System.out.println("�߸� �����̽��ϴ�.");
					continue;
				}
				
			}
			
			
			}
			
		}
			
			
			
			
		public void insertMember() {	//ȸ������ϱ� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
			
			
			
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			System.out.print("�̸��� : ");
			String email = sc.nextLine();
			System.out.print("����(M/F) : ");
			char gender = sc.nextLine().charAt(0);
			if(gender != 'M'&& gender != 'F')
			{
				System.out.println("������ �ٽ� �Է��ϼ���.");	//�̿�
				return;
			}
			
			System.out.print("���� : ");
			int age = Integer.parseInt(sc.nextLine());
			
			mc.insertMember(id, name, password, email, gender, age);
			
			
		}
		public void searchMember() {	//�˻� �޴� ��� �޼ҵ�
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸����� �˻��ϱ�");
			System.out.println("3. �̸��Ϸ� �˻��ϱ�");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ : ");
			int inputMenuNum = Integer.parseInt(sc.nextLine());
			
			switch(inputMenuNum)
			{
			case 1 : 
				mc.searchId(id);
			case 2 :
				mc.searchName(name);
			case 3 :
				mc.searchEmail(email);
			case 9 :
				mainMenu();
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				mainMenu();
			}
		}
		
		public void searchId() {	//���̵� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
			System.out.print("�˻��� ���̵� : ");
			String id = sc.nextLine();
			mc.searchId(id);
			
			if(id.equals(null)) 
			{
				System.out.println("�˻� ����� �����ϴ�.");
				mainMenu();
			}
			else
			{
				System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
				mc.searchId(id);
			}
			
			
		}
		public void searchName() {	//�̸� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
			
		}
		public void searchEmail() {	//�̸��� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
			
		}
		public void updateMember() {	//���� �޴� ��� �޼ҵ�
			
		}
		public void updatePassword() {	//��й�ȣ ������ ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
			
		}
		public void updateName() {	//�̸� ������ ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
			
		}
		public void updateEmail() {	//�̸��� ������ ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
			
		}
		public void deleteMember() {	//���� �޴� ��� �޼ҵ�
			
		}
		public void deleOne() {	//�ϳ��� ȸ�� ���� ����� ����ϴ� �޼ҵ�
			
		}
		public void delteAll() {	//��ü ȸ�� ���� ����� ����ϴ� �޼ҵ�
			
		}
		public void printAll() {	//��ü ȸ���� ����ϴ� �޼ҵ�		
			
		}
		
		


		
		
}
