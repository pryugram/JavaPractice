package com.kh.ex02.string_usage;

import java.util.StringTokenizer;

public class StringUsage {
	
	
	public static void main(String[] args) {
		//String API 정리
		
		// 1. equals 사용법
		String a = "aaa";
		String b = "aaabbb";
		String c = "bbbaaa";
		
		System.out.println(a.equals("aaa"));
		System.out.println(a.equals(b));
		System.out.println(a == new String("aaa"));	//new 때문에 주의해야 한다.
		
		// 2. compareTo : 얼마나 같은지?
		System.out.println(a.compareTo(b));	// 다른 정도가 문자열의 길이로 출력됨 : -1 -1 -1
		System.out.println(a.compareTo(c)); // ?? -1
		
		// 3. concat 문자열을 반환하는 기능
		String str = "홍길동";
		// 주의 : String의 메소드들은 대부분 변환 값을 반환함. -> String is immutable
		// 제대로된 사용법 : str = str.concat("의 주소지는 서울입니다.");
//		str = str.concat("의 주소지는 서울입니다.");
//		 System.out.println(str);
		System.out.println(str.concat("의 주소지는 서울입니다."));	//같은 표현
		System.out.println(str + "의 주소지는 서울입니다.");	//같은 표현
		// +가 코드적으로는 예외적이다. 메소드를 명시적으로 호출할 때
		
		//4. contains : 문자열 안에 keyword가 포함되었는지 찾아주는 기능
		System.out.println(str.contains("길동"));
		System.out.println(str.contains("김길동"));
		
		if(str.contains("서울") == true)
				{
					System.out.println("서울에 사는 사람입니다.");
				}
		
		//5. charAt
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		
		//6. indexOf : 입력한 문자열이 일치하는 인덱스(입력한 문자열이 시작하는) 반환
		String tempStr = "안녕하세요.";
		System.out.println(tempStr.indexOf("하"));
		System.out.println(tempStr.indexOf("한"));
		System.out.println(tempStr.indexOf("안녕"));
		tempStr = "안녕하세요. 저는 홍길동이고, 다시 안녕하세요 인사합니다. 안녕하세요??";
		System.out.println(tempStr.indexOf("안녕"));
		System.out.println(tempStr.indexOf("안녕", 5));	//indexof(char, from index)
		
		//문제 : '안녕'이 몇 번인지 세고, 인덱스를 모두 출력
		int startIndex = 0;
		while(true) 
		{
			int result = tempStr.indexOf("안녕", startIndex);
			if(result < 0)
			{
				break;
			}
			System.out.println("인덱스 : " + result);
			startIndex = result +"안녕".length();
		}
		
		
		// 7. lastIndexOf : 입력한 문자열과 일치하는 인덱스 반환
		System.out.println(tempStr.lastIndexOf("안녕"));
		System.out.println(tempStr.lastIndexOf("안녕", 28));
		
		final String origin 
		= " \r      이름 : #*홍길동, 나이 : #*23, 주소 : #*서울시 강남구   \u2003\n\t";

		//이런 문자열이 생기는 이유 : 사용자의 입력 잘못, 의도적, 
	
		//8. trim 류 : white space 제거하기 -> 사람 눈에는 안보이는 문자열. web에서 필수
		System.out.println(origin);
		System.out.println("-----------------------------------");
		System.out.println(origin.trim());				// 유니코드의 쓰레기 값 처리 불가
		System.out.println(origin.strip());				// 유니코드의 쓰레기 값도 처리 / 만일 쓰레기 값이 아니라면?
		System.out.println(origin.stripLeading());
		System.out.println(origin.stripTrailing());
		System.out.println("-----------------------------------");
		String text = origin.strip();
		System.out.println(text);
		
		//9. substring : 문자열 위치를 자를 때
		//주의 : 길이 확인 할 것
		System.out.println("-----------------------------------");
		System.out.println(text.substring(10));		//10번째 부터~
		System.out.println(text.substring(4, 10));		// 4~ 10 번째 까지
		System.out.println(text.substring(text.length() - 10, text.length()));
		// 뒤에서부터 10번째
		
		
		// 10. replace : 일반 문자열 대체할 때
		// replaceAll : 정규식을 대체?
		System.out.println("-----------------------------------");
		text = text.replace("#*", "");
		text = text.replace("홍길동", "김철순");
		System.out.println(text);
		
		String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";	//정규식
		String text2 = origin.replaceAll(match, ""); //특수문자 제거하는 정규식 -> pw 또는 ID에 특수문자 있으면 보안상 위험
		System.out.println(text2);
		System.out.println(text2.strip());
		
		
		// 11. split : 문자열을 특정 Delimiter(구분자)로 자를 때, 배열로 리턴됨
		// 이름 : 김철순, 나이 : 23, 주소 : 서울시 강남구
		// 객체화 가능?
		
		text = "이름 : 김철순, 나이 : 23, 주소 : 서울시 강남구";
		String [] array = text.split(",");
		System.out.println("-----------------------------------");
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
			
		}
		
		// 배열에서만 가능한 단축 for문
		System.out.println("-----------------------------------");
		
		for(String strText : array)
		{
			System.out.println(strText.strip());		// 필드에서 사용하는 경우
		}
		System.out.println("-----------------------------------");
		for(String strText : array) 
		{
			String [] arr = strText.strip().split(":");
			for(String s2 : arr)
			{
				System.out.println(s2.trim());
			}
		}
		
	
		System.out.println("-----------------------------------");
		//12. 토큰 짜른거 붙이기
		String result5 = String.join("_", array);
		System.out.println(result5);

		
		System.out.println("--13---------------------------------");
		//13. StringTokenizer : split의 객체버전
		StringTokenizer token = new StringTokenizer(result5, "_");
		while(token.hasMoreElements())
		{
			System.out.println(token.nextElement());
		}
		
		// 대소문자
		String result = "AAbbCCdd";
		System.out.println(result.toUpperCase()); // 대문자로
		System.out.println(result.toLowerCase()); // 소문자로
		
		//14. valueOf
		//다른 자료형 String으로 형변환하기
		int age = 23;
		//(String) age; 기본자료형 -> 참조형자료형으로 강제형변환식으로 불가능할 때
		// valueOf() 사용하면됨
		
		String strAge = String.valueOf(age);
		// =+ age
		System.out.println(strAge);
		boolean flag = true;
		String strBoolean = String.valueOf(flag);
		// =+ strBoolean
		System.out.println(strBoolean);
		// +도 상관없다 -> 기본형을 단순 print 할 일은 극히 드물다
//		"" + flag;
		
		// 15. repeat 반복하기 = 반복문 대신 쓰기 좋다.
		String repeat = "!@!@".repeat(10);
		System.out.println(repeat);
				

	}
}
