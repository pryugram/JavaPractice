import java.util.Scanner;

public class ForBK {
	
	
	public static void main1(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = Integer.parseInt(sc.next());
		b = Integer.parseInt(sc.next());
		
		if(a > b)
		{
			System.out.println(">");
		}	
		else if(a < b)
		{
			System.out.println("<");
		}
		else
		{
			System.out.println("==");
		}
		
		
	}
	
	public static void main2(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test;
//		test = Integer.parseInt(sc.next());
		test = sc.nextInt();
		
		if(test >= 0 && test <= 100)
		{
			
			if(test <= 100 && test >= 90)
			{
			System.out.println("A");
			} 
			else if(test <= 89 && test >= 80)
			{
			System.out.println("B");
			}
			else if(test <= 79 && test >= 70) 
			{
			System.out.println("c");
			}
			else if(test <=69 && test >=60)
			{
			System.out.println("D");
			}
			else if(test <60)
			{
			System.out.println("F");
			}
		}
		
	}
	
	public static void main3(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		
		year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0)
		{
				System.out.print("1");
		} 
		else if (year % 400 == 0)
		{
			System.out.print("1");
		}	
		else
		{
			System.out.print("0");
		}
		
	
	}
	
	public static void main4(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x > 0 && y > 0)
		{
			System.out.println("1");
		}
		else if(x > 0 && y < 0)
		{
			System.out.println("4");
		}
		else if(x < 0 && y > 0)
		{
			System.out.println("2");
		}
		else if(x < 0 && y < 0)
		{
			System.out.println("3");
		}
		
	
	}	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h, m;
		
		h = sc.nextInt();
		m = sc.nextInt();
		
		if(h>= 0 && h <= 23)
		{
			if(m >= 45 && m <=59)
			{
				System.out.println(h + ":" + m);
			}
			else if(m < 45 && m >= 0)
			{
				System.out.println((h-1) + ":" + (15 + m));
			}
		}
	}
}
	
//	import java.util.Scanner;
//
//	public class Main {
//	    public static void main(String[] args)   {
//	        h = sc.nextInt();
//	        m = sc.nextInt();
//	        
//	        if()
//	        
//	        
//	        
//	    }
//	    
	    
