package _JavaBasic_01;

import java.util.Scanner;

//★★★★반드시 @author란에 별명 만들어서 코드 식별하게끔 작성 바랍니다.
/**
* @author 별명입력해주세요.
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
		String str1 = "Id : " + iD + "\n비밀번호 : " + password;
		System.out.println(str1);
		return str1;
	}
	
	public String printName(String name, int age)
	{
		String str2 = "이름 : " + name + "\n나이 : " + age;
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
			System.out.print("아이디 : ");
			iD = sc.nextLine();
			System.out.print("비밀번호 : ");
			password = sc.nextLine();
			System.out.print("이름 : ");
			name = sc.nextLine();
			System.out.print("나이 : ");
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
//		jb.printName("류승규", 28);
		jb.objectArray();
		
		
	}
}
		

		
		
//	   3. 객체 배열 사용하기
//		ID와 이름이 다른 각자 다른 사용자를 100명을 생성하여 배열로 저장해주세요.
//		그리고 배열을 순회하여 100명 모두 출력하세요.
		
//	   4. 객체 배열 순회하기
//		ID/PW를 입력받고, 100개에 데이터 중 존재하는지 ID로 확인하고, 로그인 가능한지 확인해주세요.
		
//	   5. 객체 배열 변경하기
//		ID와 이름을 입력받고 ID가 존재하면 이름을 변경해 줍니다.
		
//	   6. 객체 배열 값 지우기
//		ID를 입력받고, 배열에서 ID가 탐색되지 않도록 삭제합니다. 
//		단, 다른 기능이 정상 동작하게끔 프로그램 해주세요.




