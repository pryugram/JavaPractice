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
		name = "���±�";
		height = 175;
		gender = '��';
	}
	
	
		public Student() {
			
		}
		
		public void information () {
			System.out.println("�г� : " + grade);
			System.out.println("�� : " + classroom);
			System.out.println("�̸� : " + name);
			System.out.println("Ű : " + height);
			System.out.println("���� : " + gender);
	
		}
}
