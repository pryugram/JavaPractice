package com.kh.example.practice3.model.vo;

public class Circle {

	private double pi = 3.14;
	private int radius = 1;
	
	
	
	public Circle () {
		
	}
	
	
	public void getAreaOfCircle() {
		
		double area = pi * radius * radius;
		System.out.println(area);
		
	}
	
	public void getSizeOfCircle() {

		double round = 2 * radius * pi;
		System.out.println(round);
	}
	
	public void incrementRadius() {
		
		radius = radius+ 1;
		
		
	}
	
	
	
}
