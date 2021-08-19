package note.ownpractice.method;

public class Run {
	
	public static void main(String[] args) {
		Method method = new Method();
		System.out.println("number의 k번째 약수 출력");
	int result = method.function(3050, 10);
		if(result == -1)
		{
			System.out.println("3000의 10번째 약수는 없습니다.");
		}
			else
		{
			System.out.println("3050의 10번째 약수는 " + result + "입니다.");
		}
		
		
		System.out.println("Hello World의 마지막 단어는" +  method.function2("Hello World"));
		
		
		System.out.println("(345, 567, 789) 에서 가장 큰 값은" + method.function3(345, 567, 789));
	
		System.out.println("10 팩토리얼은" + method.factorial(10));
		
		
		
	}
}
