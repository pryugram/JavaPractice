
public class DeclareVariable {

	public static void main(String[] args) {

		// Date
		// workout name
		// 기본 기능 - 변수 설정 - 입력값 도입 - 조건문 - 배열 - 반복문 - 메소드 - 클래스 - 인스턴스 
		
//		String workout = deadlift;
		
		double currentWeight = 65.0; //입력값  
		double current8Rm = 70.0; //입력값
		double currentReps = 10.0; //입력값
		double currentSets = 4.0; //입력값
		double current1Rm = currentWeight*currentReps*0.025 + current8Rm;
		double currentTotalMess = currentWeight*currentReps*currentSets + current1Rm*1.0;
		
		double targetWeight = currentWeight + 5.0; //입력값
		double target8Rm = current8Rm + 5.0; //입력값
		double targetReps = currentReps;
		double targetSets = currentSets + 1.0; //입력값
		double target1Rm = targetWeight*targetReps*0.025 + target8Rm;
		double targetTotalMess = targetWeight*targetReps*targetSets + target1Rm;
		
		
		
		
		System.out.println("date : " + "2021-07-22");
		System.out.println("workOut : " + "deadLift");
		System.out.println("currentWeight : " + currentWeight); //입력값
		System.out.println("current8Rm : " + current8Rm); //입력값
		System.out.println("currentReps : " + currentReps); //입력값
		System.out.println("currentSets : " + currentSets); //입력값
		System.out.println("current1Rm : " + current1Rm); 
		System.out.println("currentTotalMess : " + currentTotalMess);
		
		System.out.println("\ndate : " + "2021-07-29");
		System.out.println("workOut : " + "deadLift"); 
		System.out.println("targetWeight : " + targetWeight); //입력값
		System.out.println("target8Rm : " + target8Rm); //입력값
		System.out.println("targetReps : " + targetReps);		//입력값
		System.out.println("targetSets : " + targetSets);		//입력값
		System.out.println("target1Rm : " + target1Rm);		//입력값 
		System.out.println("targetTotalMess : " + targetTotalMess);
		
		
		
//		date = 07.22.2021
//		workOut = deadLift
//		currentWeight = 65.0
//		currentReps = 10.0
//		currentMaximumWeight = 80.0
//		currentSets = 4.0
//		current1Rm = 80.0
//		currentTotalMess = 65.0*10.0*4.0 + 80.0*1
		
//		targetWeight = t1
//		targetRepetitions = t2
//		targetSets = t3
//		target1Rm = 
//		target total mess = t1*t2*t3 + 
		
				
		
		// current weight
		// current repetitions
		// current set numbers
		// current 1 repetition maximum
		// current total mess
		
		// target weight
		// target repetitions
		// target set numbers
		// target 1 repetition maximum
		// target total mess
		
		
		
		
	}

}
