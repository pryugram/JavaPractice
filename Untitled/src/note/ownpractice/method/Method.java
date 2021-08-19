package note.ownpractice.method;

public class Method {

	// 입력한 숫자의 k번째 약수를 출력
	public static int function(int number, int k ) {	// 입력한 숫자의 k번째 약수를 찾아라


		for(int i = 1; i <= number; i++)
		{
			if(number % i == 0)
			{
				k--;				//10, 9, 8, .. 로 줄어들지만 1번째, 2번째, 3번째 ...
				if(k == 0)
				{
					return i;
				}
			}
		}
		return -1;	// 잘못 입력할 경우 함수가 비정상적으로 종료되었음을 알려줌, 약수가 -1이 나올 수 없음





	}
	//입력한 문자열의 마지막 글자 출력
	public static char function2(String input) {		

		return input.charAt(input.length() - 1);

	}

	// 3개의 숫자를 입력 받아 최대값 추출

	public static int max(int a, int b)
	{
		return (a > b) ? a: b;
	}

	public static int function3(int a, int b, int c)
	{
		int result = max(a,b);
		result = max(result, c);
		return result;
	}

	//팩토리얼
	public static int factorial(int number) {
		int sum = 1;
		for(int i = 2; i <= number; i++)
		{
			sum *= i;	//sum = sum * i
			
		}
		return sum;
		
		
		
}






}	





