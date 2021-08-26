package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		
		return (s.getHeight() * s.getWidth()) * 0.5;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		
		return "�ﰢ�� " + s.information();
		
	}
	
	
	

}
