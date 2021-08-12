package com.kh.example.practice4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade = 4;
		classroom = 4;
		name = "류승규";
		height = 175;
		gender = '남';
	}
	
	
		public Student() {
			
		}
		
		public void information () {
			System.out.println("학년 : " + grade);
			System.out.println("반 : " + classroom);
			System.out.println("이름 : " + name);
			System.out.println("키 : " + height);
			System.out.println("성별 : " + gender);
	
		}
}
