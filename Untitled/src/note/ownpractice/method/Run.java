package note.ownpractice.method;

public class Run {
	
	public static void main(String[] args) {
		Method method = new Method();
		System.out.println("number�� k��° ��� ���");
	int result = method.function(3050, 10);
		if(result == -1)
		{
			System.out.println("3000�� 10��° ����� �����ϴ�.");
		}
			else
		{
			System.out.println("3050�� 10��° ����� " + result + "�Դϴ�.");
		}
		
		
		System.out.println("Hello World�� ������ �ܾ��" +  method.function2("Hello World"));
		
		
		System.out.println("(345, 567, 789) ���� ���� ū ����" + method.function3(345, 567, 789));
	
		System.out.println("10 ���丮����" + method.factorial(10));
		
		
		
	}
}
