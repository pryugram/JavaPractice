package note.ownpractice.array.ObjectArray;

import java.util.Scanner;

public class ObjectArray {

	
	
	public static void main(String [] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		
//		Student student1 = new Student("ȫ�浿", 20, 175, 70, "20210101", 1, 4.5);
//		Student student2 = new Student("�̼���", 30, 170, 80, "20210101", 4, 3.0);
//		student1.show();
//		student2.show();
		
//		Teacher teacher1 = new Teacher("John Doe", 25, 180, 120, "ABC201", 3000000, 5);
//		teacher1.show();
		
		
		
		
//		Student[] students = new Student[100];
//		for(int i = 0; i < 100; i++)
//		{
//			students[i] = new Student("ȫ�浿", 21, 175, 80, i + "", 1, 4.5);	//i : �й�, �������̹Ƿ� + ""
//			students[i].show();
//		}
//		
		
		//�Է� �޾Ƽ� �л� ���� ����� ���
		
		System.out.print("�� �� ���� �л��� �����մϱ�? ");
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
			System.out.print("�л��� �̸��� �Է��ϼ��� : ");
			name = scan.next();
			System.out.print("�л��� ������ �Է��ϼ��� : ");
			age = scan.nextInt();
			System.out.print("�л��� Ű�� �Է��ϼ��� : ");
			height = scan.nextInt();
			System.out.print("�л��� �����Ը� �Է��ϼ��� : ");
			weight = scan.nextInt();
			System.out.print("�л��� �й��� �Է��ϼ��� : ");
			studentId = scan.next();
			System.out.print("�л��� �г��� �Է��ϼ��� : ");
			grade = scan.nextInt();
			System.out.print("�л��� ������ �Է��ϼ��� : ");
			gPA = scan.nextDouble();
			students [i] = new Student(name,  age,  height,  weight,  studentId,  grade,  gPA);
		}
		
		for(int i = 0; i < number; i++)
		{
			students[i].show(); 
		}
			
				
		
		
		
	}
	
	
	
}
