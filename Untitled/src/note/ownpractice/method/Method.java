package note.ownpractice.method;

public class Method {

	// �Է��� ������ k��° ����� ���
	public static int function(int number, int k ) {	// �Է��� ������ k��° ����� ã�ƶ�


		for(int i = 1; i <= number; i++)
		{
			if(number % i == 0)
			{
				k--;				//10, 9, 8, .. �� �پ������ 1��°, 2��°, 3��° ...
				if(k == 0)
				{
					return i;
				}
			}
		}
		return -1;	// �߸� �Է��� ��� �Լ��� ������������ ����Ǿ����� �˷���, ����� -1�� ���� �� ����





	}
	//�Է��� ���ڿ��� ������ ���� ���
	public static char function2(String input) {		

		return input.charAt(input.length() - 1);

	}

	// 3���� ���ڸ� �Է� �޾� �ִ밪 ����

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

	//���丮��
	public static int factorial(int number) {
		int sum = 1;
		for(int i = 2; i <= number; i++)
		{
			sum *= i;	//sum = sum * i
			
		}
		return sum;
		
		
		
}






}	





