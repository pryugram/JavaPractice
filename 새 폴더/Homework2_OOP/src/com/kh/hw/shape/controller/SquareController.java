package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		return 2 * (s.getHeight() + s.getWidth());
	}

	public double calcArea (double height, double width) {
		
		return s.getHeight() * s.getWidth();
		
	}
	
	public void paintColor(String color) {
		
		s.setColor(color);
	}
	
	public String print() {
		
		return "»ç°¢Çü " + s.information();
		
	}
	
	
	
}
