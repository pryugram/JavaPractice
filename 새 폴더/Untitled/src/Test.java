import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		char gender = '=';
		
		
		
		System.out.print("������ �Է��Ͻÿ� : ");
		gender = sc.nextLine().charAt(0);
		if(gender != 'M'&& gender != 'F')
		{
			System.out.println("������ �ٽ� �Է��ϼ���.");
			return;
		}

		
		
		
	}
}
