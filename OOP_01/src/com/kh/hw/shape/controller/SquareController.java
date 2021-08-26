package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	Shape s = new Shape();
	
	
	public double calcPerimeter(double height, double width) {
		height = s.getHeight();
		width = s.getWidth();
		return 2 * (height + width);
	}
	
	public double calcArea(double height, double width) {
		height = s.getHeight();
		width = s.getWidth();
		return height * width;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		
		return "�簢�� " + s.information();
		
	}
	

}
