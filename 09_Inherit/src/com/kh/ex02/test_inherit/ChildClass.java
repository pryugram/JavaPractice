package com.kh.ex02.test_inherit;

public class ChildClass extends SuperClass {	// 상속시에는 extends 사용
	public static void main(String[] args) {
		
	ChildClass childClass = new ChildClass();
	

	SuperClass superClass = new ChildClass();	
//	ChildClass childClass2 = new SuperClass();		어떠한 차이점?
//	형변환처럼 작은 거에 큰 거를 집어 넣으려 할 때 에러 발생
	ChildClass childClass2 = (ChildClass)new SuperClass();
	//강제 형변환	-> 손실을 야기 -> class cast Exception 에러 발생
	
	

	
		
	}
}
