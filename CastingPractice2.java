package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void method2() {
		System.out.println("------------�ǽ�����2----------------");
		double Ko;
		double En;
		double Ma;
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("���� : ");
		Ko = Double.parseDouble(sc2.nextLine());
		System.out.print("���� : ");
		En = Double.parseDouble(sc2.nextLine());
		System.out.print("���� : ");
		Ma = Double.parseDouble(sc2.nextLine());
		System.out.println("���� : " + (int)(Ko + En + Ma));
		System.out.println("��� : " + (int)(Ko + En + Ma)/3);
	}
}
