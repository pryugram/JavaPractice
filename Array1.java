
public class Array1 {

	public static void main(String[] args) {

		// Date
		// workout name
		// 기본 기능 - 변수 설정 - 입력값 도입 - 조건문 - 배열 - 반복문 - 메소드 - 클래스 - 인스턴스 
		
		String workout = "deadlift";
		char g1 = 'A';
		char g2 = 'B';
		char g3 = 'C';

		
		
		double currentWeight = Double.parseDouble(args[0]); //입력값  // convert String to double
		double currentSets = Double.parseDouble(args[1]);
		double currentReps = Double.parseDouble(args[2]);
		
		// g3
		double current8Rm = currentWeight + 5.0; //입력값
		double current1Rm = currentWeight*currentReps*0.025 + current8Rm;
		double currentTotalMess = currentWeight*currentReps*currentSets + current1Rm*1.0;
		
		//g2
		double targetWeight = currentWeight + 5.0; //입력값
		double target8Rm = current8Rm + 5.0; //입력값
		double targetSets = currentSets + 1.0; //입력값
		double targetReps = currentReps;
		double target1Rm = targetWeight*targetReps*0.025 + target8Rm;
		double targetTotalMess = targetWeight*targetReps*targetSets + target1Rm;
		
		
		
		
		//g1
		double targetSets2 = currentSets + 1.0;
		double targetReps2 = currentReps + 5.0;
		double targetTotalMess2 = targetWeight*targetReps2*targetSets + target1Rm;
		
		
		
		System.out.println("Workout : " + workout);
		System.out.println("date : " + "2021-07-22");
		System.out.println("workOut : " + "deadLift");
		System.out.println("currentWeight : " + currentWeight); //입력값
		System.out.println("current8Rm : " + current8Rm); //입력값
		System.out.println("currentReps : " + currentReps); //입력값
		System.out.println("currentSets : " + currentSets); //입력값
		System.out.println("current1Rm : " + current1Rm); 
		System.out.println("currentTotalMess : " + currentTotalMess);
		
		
	
		
		if (currentSets < 4.0) {
			System.out.println("\nGrade : " + g3);
			System.out.println("date : " + "2021-07-29");
			System.out.println("workOut : " + "deadLift");
			System.out.println("currentWeight : " + currentWeight); //입력값
			System.out.println("current8Rm : " + current8Rm); //입력값
			System.out.println("currentReps : " + currentReps); //입력값
			System.out.println("currentSets : " + targetSets2); //입력값
			System.out.println("current1Rm : " + current1Rm); 
			System.out.println("currentTotalMess : " + currentTotalMess);		
			
			
	
		
		} else if (currentReps < 10) {
		
		System.out.println("\nGrade : " + g2);
		System.out.println("date : " + "2021-07-29");
		System.out.println("workOut : " + "deadLift");
		System.out.println("currentWeight : " + currentWeight); //입력값
		System.out.println("current8Rm : " + current8Rm); //입력값
		System.out.println("currentReps : " + targetReps2); //입력값
		System.out.println("currentSets : " + currentSets); //입력값
		System.out.println("current1Rm : " + current1Rm); 
		System.out.println("currentTotalMess : " + targetTotalMess2);
		
		
		}
		
		
		else {
		
		
			
			System.out.println("\nGrade : " + g1);
			System.out.println("date : " + "2021-07-29");
			System.out.println("workOut : " + "deadLift"); 
			System.out.println("targetWeight : " + targetWeight); //입력값
			System.out.println("target8Rm : " + target8Rm); //입력값
			System.out.println("targetReps : " + targetReps);		//입력값
			System.out.println("targetSets : " + targetSets);		//입력값
			System.out.println("target1Rm : " + target1Rm);		//입력값 
			System.out.println("targetTotalMess : " + targetTotalMess);
		
		
		

		
		
		}
		
		}
		

}
