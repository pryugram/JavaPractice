import java.util.Scanner;	// 기본 컴파일러에 존재하지 않는 라이브러리를 외부에서 가져오는 것;

public class Main {

	public static int max(int a, int b) {
		
		return(a > b) ? a : b;
	}
	
	
	public static void main1(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요 : ");
		int number = sc.nextInt();
		int [] array = new int[number];
		
		for(int i = 0; i < number; i ++)
		{
			System.out.print("배열에 입력할 정수를 하나씩 입력하세요(양수) : ");
			array[i] = sc.nextInt();
		}
		
		int result = -1;
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);		// 양수 출력 방법  
		}
		
		System.out.println("입력한 모든 정수 중에서 가장 큰 값은 : " + result);
		
	}

	public static void main(String[] args) {
		
		int[] array = new int[100];
		for(int i = 0; i < 100; i++)
		{
			array[i] = (int) (Math.random() * 100 + 1);		// Math.random : 0 < x < 1 인 x 값을 생성
															//	100x + 1 : 1 <= x < 101
			
		}
		
		int sum = 0;
		for(int i = 0; i < 100; i++) 
		{
			sum += array[i];
		}
		
		System.out.println("100개의 랜덤 정수의 평균 값은 " + sum / 100 + "입니다.");
		// 데이터가 많을수록 평균값에 수렴하게 된다(1~100)
		
	}
		
	
}
