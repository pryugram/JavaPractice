package com.kh.example.practice2.model.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
	public Product () {
		
		
	}
	
	public void information () {
		pName = "������";
		brand = "����";
		price = 100;
		
		
		System.out.println("��ǰ�� : " + pName + " ");
		System.out.println("������ : " + brand);
		System.out.print(price + "����");
	
	
	}
	

}
