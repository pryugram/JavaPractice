package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void method2() {
		System.out.println("------------실습문제2----------------");
		double Ko;
		double En;
		double Ma;
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("국어 : ");
		Ko = Double.parseDouble(sc2.nextLine());
		System.out.print("영어 : ");
		En = Double.parseDouble(sc2.nextLine());
		System.out.print("수학 : ");
		Ma = Double.parseDouble(sc2.nextLine());
		System.out.println("총점 : " + (int)(Ko + En + Ma));
		System.out.println("평균 : " + (int)(Ko + En + Ma)/3);
	}
}
