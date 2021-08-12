package com.kh.example.practice5.model.vo;

public class Lotto {
	int [] lotto = new int[] {};
		
		
	{
		int [] lotto = new int[6];
		for(int i = 0; i < lotto.length; i ++)
		{
			lotto[i] = (int) (Math.random() * 45 + 1);
			for(int j = 0; j < i; i++)
			{
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
	}
	
	public Lotto() {
		
	}
	
	public void information() {
		
		System.out.println("로또 번호 : ");
		for(int i = 0; i < lotto.length; i ++)
		{
			System.out.println(lotto[i]);
		}
		
		
	}
	

}
