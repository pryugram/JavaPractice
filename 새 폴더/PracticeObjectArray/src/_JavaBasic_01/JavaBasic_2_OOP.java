package _JavaBasic_01;

import java.util.Scanner;

//�ڡڡڡڹݵ�� @author���� ���� ���� �ڵ� �ĺ��ϰԲ� �ۼ� �ٶ��ϴ�.
/**
* @author �����Է����ּ���.
*
*/
public class JavaBasic_2_OOP {
	private String iD;
	private String password;
	private String name;
	private int age;
	
	Scanner sc = new Scanner(System.in);

	public JavaBasic_2_OOP() {
		super();
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public JavaBasic_2_OOP(String iD, String password, 
								String name, int age) {
		super();
		this.iD = iD;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "JavaBasic_2_OOP [iD=" + iD + ", password=" + password + 
								", name=" + name + ", age=" + age + "]";
	}
	
	public String printID(String iD, String password) {
		String str1 = "Id : " + iD + "\n��й�ȣ : " + password;
		System.out.println(str1);
		return str1;
	}
	
	public String printName(String name, int age)
	{
		String str2 = "�̸� : " + name + "\n���� : " + age;
		System.out.println(str2);
		return str2;
	}
	
	public void objectArray() {
		JavaBasic_2_OOP [] inputArr = new JavaBasic_2_OOP[3];
		
//		int number = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < inputArr.length; i++)
		{
			String iD;
			String password;
			String name;
			int age;
			System.out.print("���̵� : ");
			iD = sc.nextLine();
			System.out.print("��й�ȣ : ");
			password = sc.nextLine();
			System.out.print("�̸� : ");
			name = sc.nextLine();
			System.out.print("���� : ");
			age = Integer.parseInt(sc.nextLine());
			
			inputArr[i] = new JavaBasic_2_OOP(iD, password, name, age);
		}
		
		for(int i = 0; i < inputArr.length; i++)
		{
			System.out.println(inputArr[i]);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		JavaBasic_2_OOP jb = new JavaBasic_2_OOP();
//		jb.printID("ryu", "1111");
//		jb.printName("���±�", 28);
		jb.objectArray();
		
		
	}
}
		

		
		
//	   3. ��ü �迭 ����ϱ�
//		ID�� �̸��� �ٸ� ���� �ٸ� ����ڸ� 100���� �����Ͽ� �迭�� �������ּ���.
//		�׸��� �迭�� ��ȸ�Ͽ� 100�� ��� ����ϼ���.
		
//	   4. ��ü �迭 ��ȸ�ϱ�
//		ID/PW�� �Է¹ް�, 100���� ������ �� �����ϴ��� ID�� Ȯ���ϰ�, �α��� �������� Ȯ�����ּ���.
		
//	   5. ��ü �迭 �����ϱ�
//		ID�� �̸��� �Է¹ް� ID�� �����ϸ� �̸��� ������ �ݴϴ�.
		
//	   6. ��ü �迭 �� �����
//		ID�� �Է¹ް�, �迭���� ID�� Ž������ �ʵ��� �����մϴ�. 
//		��, �ٸ� ����� ���� �����ϰԲ� ���α׷� ���ּ���.




