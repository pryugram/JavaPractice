package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	public int size = 10;	//���� �����ϴ� ��� �� ��ȯ
	private Member[] m = new Member[size];	
	
	public int MemberNum () {
		
	}
	
	public boolean checkId(String input) {	// ID �ߺ�Ȯ�� �޼ҵ�
		
	}
	
	public void insertMember(String id, String name, String password,
									String email, char gender, int age) {	// Member��ü�� ��ü�迭�� �����ϴ� �޼ҵ�
		
		
	}	
	
	public String searchId(String id) {	//id�� ȸ���� ��ȸ�ϴ� �޼ҵ�
		
		
	}
	
	public Member[] searchName(String name) {//�̸����� ȸ���� ��ȸ�ϴ� �޼ҵ�
		
	}
	
	public Member[] searchEmail(String email) {//�̸��Ϸ� ȸ���� ��ȸ�ϴ� �޼ҵ�
		
	}
	
	public boolean updatePassword(String id, String password) {//��й�ȣ ���� �޼ҵ�
		
	}
	
	public boolean updateName(String id, String name) {//�̸� ���� �޼ҵ�
		
	}
	
	public boolean updateEmail(String id, String email) {//�̸��� ���� �޼ҵ�
		
	}
	
	public boolean delete(String id) {//�� ȸ���� �����ϴ� �޼ҵ�
		
	}
	
	public void delete() {//��ü ȸ���� �����ϴ� �޼ҵ�
		
	}
	
	public Member[] printAll() {//Member ��ü ��ȯ �޼ҵ�
		
	}
	
	
	
	
	
	
	
}
