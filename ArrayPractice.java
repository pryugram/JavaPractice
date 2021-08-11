package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int [] array = new int[10];
		
		for(int i = 0; i <array.length; i++)
		{
			array[i] = i + 1;
			System.out.print(array[i] + " ");
		}
		
	}
	
	
	public void practice2() {
		
		int [] array = new int[10];
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = 10 - i;
			System.out.printf("%d ",array[i]);
			
		}
		
	}
	
	public void practice3() {
		/*
		 * 정수 입력 받기 
		 * 배열 크기 할당 
		 * 1부터 입력 받은 값까지 배열에 초기화 후 출력  
		 *
		 */
		System.out.print("정수 입력 : ");
		
		int num = 0;
		num = sc.nextInt();
		int [] array = new int [num];
		
		for(int i = 0; i < num; i++)
		{
			array[i] = i + 1;
			System.out.printf("%d ",array[i]);
			
		}
	}
	
	public void practice4() {
		/*
		 * 길이 5 String 배열 선언
		 * 	"사과", "귤", "포도", "복숭아", "참외" 로 초기화 
		 * 	배열 인덱스 활용해서 귤을 출력 
		 */
		
		String [] array = new String [5];
		array = String [] {"사과", "귤", "포도", "복숭아", "참외"};
		
		
		
		
		
	}
	public void practice5() {
		/*	문자열을 입력 받기
		 * 문자 하나하를 배열에 넣기
		 * 검색할 문자 입력 받기
		 * 문자열에 포함된 문자 개수 출력
		 * 검색한 문자가 몇 번째 인덱스에 위치하는지 인덱스 출
		 */
		
		
//		String [] array = new String [];
		
		
	}
	
	public void practice6() {
		/*
		 * 월 ~ 일 까지 초기화된 문자열 배열 형성하기
		 * 0 부터 6까지 숫자 입력 받기
		 * 입력한 숫자와 같은 인덱스에 있는 요일 출력
		 * 범위에 없는 숫자 입력 시 "잘못 입력하셨습니다" 출력
		 */
		
	}
	public void practice7() {
		/*
		 * 사용자가 배열의 길이 직접 입력
		 * 입력 받은 값만큼 정수형 배열 선언 및 할당
		 * 배열의 크기만큼 사용자가 직접 값을 입력하여 인덱스 값 초기화
		 * 배열 전체 값을 나열
		 * 인덱스에 저장된 값들의 합을 출
		 */
		
	}
	public void practice8() {
		/*
		 * 3이상인 홀수 자연수 입력 받기
		 * 배열 중간까지는 1부터 1씩 증가하는 오름차순 값 넣어 출력하기 
		 * 중간 이후부터 끝까지 1씩 감소하는 내림차순 값 넣어 출력하기 
		 * 입력한 정수가 홀수가 아니거나 3 미만일 경우 "다시 입력하세요" 출력 후 다시 정수 입력 받
		 */
		
	}
	public void practice9() {
		/*
		 * 
		 * 사용자가 입력한 값이 배열에 있는지 검색  
		 * 배열에 있으면 "ㅇㅇㅇ 치킨 배달 가능"
		 * 없으면 "ㅇㅇㅇ 치킨은 없는 메뉴입니다" 출력
		 * 치킨 메뉴가 들어가 있는 배열은 본인 스스로 정하기
		 */
		
	}
	public void practice10() {
		/*
		 * 주민등록번호 성별 구분 자리 이후부터 *로 가리고 출력
		 * 단 원본 배열 값은 변경 없이 배열 복사본으로 변
		 */
		
	}
	public void practice11() {
		/*
		 * 10 개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		 * 1 ~ 10 사이의 난수 발생시킨 후 배열 초기화 및 출력  
		 */
		
	}
	public void practice12() {
		/*
		 * 
		 * 11번 +
		 * 배열 전체 값과 그 값 중 최대값, 최소값 출력  
		 * 
		 */
		
	}
	public void practice13() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당
		 * 1 ~ 10 사이의 난수를 발생시켜 중복 값이 없도록 배열에 초기화한 후 출력  
		 * 
		 */
		
	}
	public void practice14() {
		/*	로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력 
		 * 
		 */
		
	}
	public void practice15() {
		/*
		 * 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장 
		 * 문자의 개수와 함께 출력  
		 */
		
	}
	public void practice16() {
		/*
		 * 사용자가 입력한 배열의 길이만큼의 문자열 배열 선언, 할당
		 * 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화
		 * 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지, 늘린 곳에 어떤 데이터를 넣을 것인지 입력 받기
		 * 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값 출력
		 * 
		 * 
		 */
		
	}

}
