import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		char gender = '=';
		
		
		
		System.out.print("성별을 입력하시오 : ");
		gender = sc.nextLine().charAt(0);
		if(gender != 'M'&& gender != 'F')
		{
			System.out.println("성별을 다시 입력하세요.");
			return;
		}

		
		
		
	}
}
