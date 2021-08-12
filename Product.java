package com.kh.example.practice2.model.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
	public Product () {
		
		
	}
	
	public void information () {
		pName = "아이폰";
		brand = "애플";
		price = 100;
		
		
		System.out.println("제품명 : " + pName + " ");
		System.out.println("제조사 : " + brand);
		System.out.print(price + "만원");
	
	
	}
	

}
