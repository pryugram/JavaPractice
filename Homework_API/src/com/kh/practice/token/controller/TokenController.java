package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		String str2 = "";
		StringTokenizer afterStr = new StringTokenizer(str, " ");
		
		while(afterStr.hasMoreElements())
		{
			str2 += afterStr.nextElement();
		}
		
		return str2;
		

			
			
		
	}
	
	public String firstCap(String input) {
		String upperStr = input.toUpperCase().charAt(0) + input.substring(1, input.length());
		return upperStr;
		
	}
	
	public int findChar(String input, char one) {
		
		int count = 0;
			for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) == one)
			{
				count++;
			}
		}
		
		
		return count;
	}

}
