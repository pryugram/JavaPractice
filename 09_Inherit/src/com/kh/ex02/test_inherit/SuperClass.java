package com.kh.ex02.test_inherit;

public class SuperClass {	//  부모 클래스
	protected int protectedValue = 5;

	
	public SuperClass() {	//	return 값?		instance?
		System.out.println("저는 Super class입니다.");
		
	}
	
	public void SuperClass() {	//	void가 붙으면 메소드가 되어버림
		System.out.println("저는 Super class입니다.");
		
	}
	
	public SuperClass(int i) {
		
	}
	
	
	public void publicMethod() {
		System.out.println("저는 Super class의 public Method입니다.");
		
		
		
	}
	
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		SuperClass superClass2 = new SuperClass(1);
		
		
		
	}
	
}
