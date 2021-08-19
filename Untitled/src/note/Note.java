package note;

public class Note {

	String chap1;
	String chap2;
	String chap3;
	String chap4;
	String chap5;
	String chap6;
	String chap7;
	String chap8;
	
	
	public void init() {
		
		chap1 = "변수";
		chap2 = "연산자";
		chap3 = "조건문";
		chap4 = "반복문";
		chap5 = "배열";
		chap6 = "객체지향 1";
		chap7 = "객체지향 2";
		
		
		
		
	}
	
	
	
	
	public Note() {
		
	}
	
	public String ownVariable() {
		
		/*
		chap1 =
		1. 변수 : 값을 저장하는 장소
		
		1) 변수의 유형 
			- 기본형 : 메모리에 실제 값이 저장되는 변수형, int, long, double... 
			- 참조형 : 메모리의 특정 객체(Instance)의 주소지를 가르치는 변수형, String, Random .. 
		
		2) 변수 선언방법
			 - 선언법 1) : Type 변수명;
			 - 선언법 2) : Type 변수명 = 초기화 값;
		
		  - 변수명 선언규칙 (컴파일)
		    1) 예약어 금지
		    2) 첫글자로 숫자 사용X 
		    3) 특수문자는 $_ 빼고 포함 금지 
		    4) 공백을 사용할수 없다 '_' 표기 가능
		  
		  - 변수명 선언규칙 (사용 할 때) 
		    - 카멜표기법 = 첫글자가 소문자, 
		    - 단 상수 예외로 대문자가 사용 가능하다.
		
		3) 기본형
			- 정수형
				int   : 4byte
				short : 2byte
				long  : 8byte  // 끝에 l L 써야된다.
			- 실수형
				double : 8byte  
				float  : 4byte	// 끝에 f F 써야 된다.
		
			- 문자형
				char   : 2byte // why? : 유니코드의 크기
		
			- 논리형	
				boolean : 1byte, true, false
		
		4) 참조형
		  - Class의 Type으로 선언된 형
		  - 실제 객체는 Heap에 생성되고 참조형 변수로 접근할 수 있다.
		  - new로 키워드 생성
		  - 초기화 값은 null로 초기화 한다.
		  - ex.) String : 문자열, Random : random 수에 관련된 기능
		
		5) Type casting (형변환)
		 - 명시적 / 강제 형변환
		 	: 변수1 = (Type)변수2; 으로 사용한다.
		 	: 사용자가 큰타입 -> 작은 타입으로 변환시킬 때 사용한다.
		     : 사용하지 않으면 casting exception이 발생하다.
		     : 데이터가 손실됨을 인지하고 써야한다.
		 	long v1; int v2; ... v2 = (int)v1;
		 
		 - 묵시적 / 자동 형변환
				: 작은타입 -> 큰타입으로 변환될때 별다른 문법 없이 사용된다.
				: 특별한 문제가 없어 에러가 발생하지 않는다.
		
		6) Overflow
		 - 변수의 크기를 넘어선 연산을 할때 사용자가 예측하지 못하는 값으로 들어오는 현상
		 - byte value = 127; 127++ 순간 -> -128로 바뀌는 현상
		 
		 
		7) 상수 : 한번 선언되고 초기화 된 이후 절대 변하지 않는 수
			- 변수 앞에 final을 쓴다.
		   ex) final int MAX_SIZE = 10 
		   ";
		
		
		
		
		
		
		return chap1;
		*/
//		return comment;
		
		
	}
	
	
	
	
	
}
