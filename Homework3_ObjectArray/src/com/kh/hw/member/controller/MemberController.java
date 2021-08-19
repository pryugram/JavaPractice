package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	public int size = 10;	//현재 존재하는 멤버 수 반환
	private Member[] m = new Member[size];	
	
	public int MemberNum () {
		
	}
	
	public boolean checkId(String input) {	// ID 중복확인 메소드
		
	}
	
	public void insertMember(String id, String name, String password,
									String email, char gender, int age) {	// Member객체를 객체배열에 저장하는 메소드
		
		
	}	
	
	public String searchId(String id) {	//id로 회원을 조회하는 메소드
		
	}
	
	public Member[] searchName(String name) {//이름으로 회원을 조회하는 메소드
		
	}
	
	public Member[] searchEmail(String email) {//이메일로 회원을 조회하는 메소드
		
	}
	
	public boolean updatePassword(String id, String password) {//비밀번호 변경 메소드
		
	}
	
	public boolean updateName(String id, String name) {//이름 변경 메소드
		
	}
	
	public boolean updateEmail(String id, String email) {//이메일 변경 메소드
		
	}
	
	public boolean delete(String id) {//한 회원만 삭제하는 메소드
		
	}
	
	public void delete() {//전체 회원을 삭제하는 메소드
		
	}
	
	public Member[] printAll() {//Member 객체 반환 메소드
		
	}
	
	
	
	
	
	
	
}
