package note.ownpractice.array.ObjectArray;

import java.util.Scanner;

public class ObjectArray {

	
	
	public static void main(String [] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		
//		Student student1 = new Student("홍길동", 20, 175, 70, "20210101", 1, 4.5);
//		Student student2 = new Student("이순신", 30, 170, 80, "20210101", 4, 3.0);
//		student1.show();
//		student2.show();
		
//		Teacher teacher1 = new Teacher("John Doe", 25, 180, 120, "ABC201", 3000000, 5);
//		teacher1.show();
		
		
		
		
//		Student[] students = new Student[100];
//		for(int i = 0; i < 100; i++)
//		{
//			students[i] = new Student("홍길동", 21, 175, 80, i + "", 1, 4.5);	//i : 학번, 정수형이므로 + ""
//			students[i].show();
//		}
//		
		
		//입력 받아서 학생 정보 출력할 경우
		
		System.out.print("총 몇 명의 학생이 존재합니까? ");
		int number = scan.nextInt();
		Student[] students = new Student[number];
		for(int i =0 ; i < number; i++)
		{
			String name;
			int age;
			int height;
			int weight;
			String studentId;
			int grade;
			double gPA;
			System.out.print("학생의 이름을 입력하세요 : ");
			name = scan.next();
			System.out.print("학생의 나이을 입력하세요 : ");
			age = scan.nextInt();
			System.out.print("학생의 키를 입력하세요 : ");
			height = scan.nextInt();
			System.out.print("학생의 몸무게를 입력하세요 : ");
			weight = scan.nextInt();
			System.out.print("학생의 학번을 입력하세요 : ");
			studentId = scan.next();
			System.out.print("학생의 학년을 입력하세요 : ");
			grade = scan.nextInt();
			System.out.print("학생의 학점을 입력하세요 : ");
			gPA = scan.nextDouble();
			students [i] = new Student(name,  age,  height,  weight,  studentId,  grade,  gPA);
		}
		
		for(int i = 0; i < number; i++)
		{
			students[i].show(); 
		}
			
				
		
		
		
	}
	
	
	
}
