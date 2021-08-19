package com.kh.hw.member.view;

import java.util.Scanner;
import com.kh.hw.member.controller.MemberController;

public class MemberMenu {

		Scanner sc = new Scanner(System.in);
		MemberController mc = new MemberController();

		public MemberMenu () {	//기본 생성자
			
			
		}
		
		public void mainMenu() {	//메인 메뉴 출력 메소드
//			System.out.println("최대 등록 가능한 회원 수는 " + size + "명입니다.");
//			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");
//			mc.m[];	//mc 클래스 안의 멤버 필드 이용
			
			//현재 회원 수가 10명이 아닐 때
			
			while(true)				
			{
				
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int inputMenuNum = Integer.parseInt(sc.nextLine());

			if(true)	//	회원 수가 10명이 아닐 때
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
					System.out.println("잘못 누르셨습니다.");
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
					System.out.println("잘못 누르셨습니다.");
					continue;
				}
				
			}
			
			
			}
			
		}
			
			
			
			
		public void insertMember() {	//회원등록하기 위한 데이터를 사용자에게 입력 받는 메소드
			
			
			
		}
		public void searchMember() {	//검색 메뉴 출력 메소드
			
		}
		public void searchId() {	//아이디 검색을 위한 데이터를 사용자에게 입력 받는 메소드
			
		}
		public void searchName() {	//이름 검색을 위한 데이터를 사용자에게 입력 받는 메소드
			
		}
		public void searchEmail() {	//이메일 검색을 위한 데이터를 사용자에게 입력 받는 메소드
			
		}
		public void updateMember() {	//수정 메뉴 출력 메소드
			
		}
		public void updatePassword() {	//비밀번호 수정을 위한 데이터를 사용자에게 입력 받는 메소드
			
		}
		public void updateName() {	//이름 수정을 위한 데이터를 사용자에게 입력 받는 메소드
			
		}
		public void updateEmail() {	//이메일 수정을 위한 데이터를 사용자에게 입력 받는 메소드
			
		}
		public void deleteMember() {	//삭제 메뉴 출력 메소드
			
		}
		public void deleOne() {	//하나의 회원 삭제 결과를 출력하는 메소드
			
		}
		public void delteAll() {	//전체 회원 삭제 결과를 출력하는 메소드
			
		}
		public void printAll() {	//전체 회원을 출력하는 메소드		
			
		}
		
		


		
		
}
