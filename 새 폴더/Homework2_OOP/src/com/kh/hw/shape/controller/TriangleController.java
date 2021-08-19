package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;


public class TriangleController {
	private Shape s = new Shape(); 
		
	public double calcaArea(double height, double width) {
		return  0.5 * s.getHeight() * s.getWidth();
	}
	
	public void paintColor(String color) {
		
		s.setColor(color);
	}
	

	public String print() {
		
		return "»ï°¢Çü " + s.information();
	}
		
	
}
