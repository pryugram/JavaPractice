package com.kh.ex01.basic_inherit;

import java.util.Date;

public class BasicInherit {
	
	public static void main(String[] args) {
		Object obj1 = new Object();			//모든 클래스의 조상
		Object obj2 = new BasicInherit();
		Object obj3 = new String("112");
		//why? Object가 Super임으로 형변환 생략 가능(자동 형변환)
		Object obj4 = new Date();
		
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		System.out.println(obj4.toString());
		
		
		System.out.println(obj1.getClass().getName());
		System.out.println(obj2.getClass().getName());
		System.out.println(obj3.getClass().getName());
		System.out.println(obj4.getClass().getName());

		//null
		//Root
		// -------
		//| 	|
		//String Date
		
		
		System.out.println(obj1.getClass().getSuperclass());
		System.out.println(obj2.getClass().getSuperclass());
		System.out.println(obj3.getClass().getSuperclass());
		System.out.println(obj4.getClass().getSuperclass());
		
		
		
		//상속 코드의 꽃!!
		Object[] objArray = new Object[4];
		objArray[0] = obj1;
		objArray[1] = obj2;
		objArray[2] = obj3;
		objArray[3] = obj4;
		
		for(int i = 0; i < objArray.length; i++)
		{
			System.out.println("인스턴스 Name : " + objArray[i].getClass().getName());
			System.out.println("부모 Class : " + objArray[i].getClass().getSuperclass());
		}
		
		
		
		
	}
	

}
