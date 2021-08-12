package com.kh.example.practice1.model.vo;

public class Member {
	
	/*
	 *	private, class, field(Member var?),
	 *	constructor, method  
	 */
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String phone;
	private String email;
	private int age;
	private char gender;
	
	public Member() {
		
		
		
	}
	 
	public void changeName(String name) {
		
		memberName = name;
		
	}
	
	public void printName() {
		
		
		System.out.println(memberName);
		
	}
	

}
