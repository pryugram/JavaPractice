package note.ownpractice.array.ObjectArray;

public class Student extends Person {		//Students Ŭ������ Person�� ��� ����
	private String studentId;
	private int grade;
	private double GPA;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public Student(String name, int age, int height, int weight, String studentId, int grade, double gPA) {
		super(name, age, height, weight);	
		this.studentId = studentId;
		this.grade = grade;
		GPA = gPA;
	}
	
	public void show() {
		System.out.println("------------------------------");
		System.out.println("�л� �̸� : " + getName());
		System.out.println("�л� ���� : " + getAge());
		System.out.println("�л� Ű : " + getHeight());
		System.out.println("�л� ������ : " + getWeight());
		System.out.println("�й� : " + getStudentId());
		System.out.println("�г� : " + getGrade());
		System.out.println("����: " + getGPA());
		
	}
	
	
	
	
	
}
