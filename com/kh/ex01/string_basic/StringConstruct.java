package com.kh.ex01.string_basic;

public class StringConstruct {

	public static void main(String[] args) {
		// String은 어디서도 immutable하다.
		
		
		String str1 = "Test String"; // 올바른 사용법  
//		string constant pool 저장(Heap에 저장되나 다르게 관리됨),  immutable 
		String str2 = new String("Test String"); // heap
		
		String str3 = str2.toString(); // heap  -> shallow copy, immutable
		
		String str4 = str3.intern();// 올바른 사용법 -> string constant pool 사용해야 속도도 빠르고 메모리 중복 방지 
		//  string constant pool 저장

		str1.equals(str2);
		System.out.println(str1.hashCode()); // equals로 하면 동일
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		System.out.println("str1,2,3 간 비교");
		System.out.println(str1 == str2); // false
		System.out.println(str2 == str3); // true
		System.out.println(str3 == str1); // false

		System.out.println("intern과 비교");
		System.out.println(str1 == str4); // true
		System.out.println(str2 == str4); // false
		System.out.println(str3 == str4); // false
		
		
		System.out.println("String의 메모리 주소값(과 유사한 번호)");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		
		// String 사용 Tip
		// 1. String의 저장 장소는 Heap과 string constant pool 두가지가 있다.
		// 2. string constant pool로 사용하는 것이 메모리 관리 측면에서 매우 유리하다. 
		// 3. String은 가급적이면 new로 생성하지 않는다. // heap을 사용하지 않는다.
		// 4. equals로 비교한다.
		
		
		
		String temp = ""; // 차리리 공백으로 초기화하자. null로 하지 말아라? -> 
		temp += "123" + "," + "김길동";
		System.out.println(temp);
		
		// String 에외처리 처리할 때
		if(temp == null || temp.length() < 0) 
		{
			//에러 테스트
			System.out.println("에러입니다.");
			return;
		}
		
		
		// ....
	}
}
