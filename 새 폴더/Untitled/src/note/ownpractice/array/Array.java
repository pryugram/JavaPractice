package note.ownpractice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
	Scanner sc = new Scanner(System.in);
	
	public void practice4() {
		System.out.println("4. 문자열에서 문자 찾기");
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char inputChar = sc.next().charAt(0);
		int count = 0;
		char[] chaArray = str.toCharArray();
		
		
		System.out.print(str + "에 " + inputChar + "가 존재하는 위치 : ");
		for(int i = 0; i < chaArray.length ; i++)
		{
			chaArray[i] = str.charAt(i);
			if(chaArray[i] == inputChar)
			{
				System.out.print(i + ", ");
				count++;
			}
		}
		
		System.out.println("\n" + inputChar + "개수 : " + count);
		
		
	}
	
	public void practice5() {
		System.out.println("5. 요일 출력");
//		while(true)
//		{
//		System.out.print("0 ~ 6 사이의 숫자 입력 : ");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		String [] dayArr = new String[] {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
//
//		if(num > -1 && num < 7)
//		{
//			System.out.println(dayArr[num]);
//			break;
//		}
//		else
//		{
//			System.out.println("잘못 입력하셨습니다.");
//			continue;
//		}
//		}
		String[] dayArray = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int inputNum = Integer.parseInt(sc.nextLine());
		
		if(inputNum < 0 || inputNum > 6) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.println(dayArray[inputNum]);
		return;
		
	}

	public void practice6() {
		System.out.println("6. 배열 입력");
		System.out.print("정수 : ");
		
		int num = Integer.parseInt(sc.nextLine());
		int [] numArr = new int[num];
		int sum = 0;
		
		
		for(int i = 0; i < numArr.length; i++)
		{
			System.out.print("배열" + (i+1) + "번째 인덱스에 넣을 값 : ");
			numArr[i] = Integer.parseInt(sc.nextLine());
		}
		for(int i = 0; i < numArr.length; i++)
		{
			System.out.print(numArr[i] + " ");
			sum += numArr[i];
		}
		System.out.println("총합 : " + sum);
		return;
	}
	
	public void practice7() {
		System.out.println("7. 오름차순, 내림차순으로 나열되는 배열의 홀수값 입력 받기");
		int num = 0;
		while(true)
		{
			System.out.print("홀수인 정수 : ");
			num = Integer.parseInt(sc.nextLine());
			
			if(num % 2 == 0)
			{
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			break;
		}
		int [] numA = new int[num];
		int halfNum = num / 2;
		
		for(int i = 0; i <= halfNum; i++)
		{
			numA[i] = (i+1);
		}
		for(int i = halfNum + 1; i < num; i++)
		{
			numA[i] = numA[i - 1] - 1;
		}
		for(int i = 0; i < num; i ++)
		{
			System.out.print(numA[i] + " ");
			
		}
		System.out.println();
		return;
		
		}
		
	public void practice8() {
		System.out.println("8. 배열 내에서 검색");
		String [] chickenArray = new String [] {"후라이드", "양념", "간장", "불닭"};
		
		while(true)
		{
			System.out.print("치킨 이름을 입력하세요 : ");
			String chicken = sc.nextLine();
			
			for(int i = 0; i < chickenArray.length; i++)
			{
				if(chickenArray[i].equals(chicken))
				{
					System.out.println(chicken + "치킨 배달 가능");
					return;
				}
			}
			
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
			return;
			
		}
	}
	
	public void practice9() {
		System.out.println("9. 주민등록번호 출력");
		System.out.print("주민등록번호(-포함) : ");
		String inputIdnum = sc.nextLine();
		
		String [] idNum = new String[13];
		String [] copy = new String[idNum.length];

		for(int i = 0; i < idNum.length; i++)
		{
			idNum[i] = "" + inputIdnum.charAt(i);
		}
		
		System.arraycopy(idNum, 0, copy, 0, 8);
		for(int i = 8; i < copy.length; i++)
		{
			copy[i] = "*";
		}
		
		for(int i = 0; i < copy.length; i++)
		{
			System.out.print(copy[i]);
		}
		return;
	}
	
	public void practice10() {
		System.out.println("10. 난수 배열 출력");
		int [] randomArray = new int[10];
		for(int i = 0; i < randomArray.length; i++)
		{
			randomArray[i] = (int) (Math.random() * 10 + 1);
		}
		for(int i = 0; i < randomArray.length; i++)
		{
			System.out.print(randomArray[i] + " ");
		}
		return;
		
//		Random random = new Random(System.currentTimeMillis());
//		for(int i = 0; i < randomArray.length; i++)
//		{
//			randomArray[i] = random.nextInt(10);
//		}
//		for(int i = 0; i < randomArray.length; i++)
//		{
//			System.out.print(randomArray[i] + " ");
//		}
//
	}
	
	public void practice11() {
		System.out.println("11. 난수 배열 출력 후 최대값, 최소값 출력");
		int max = 0;
		int min = 0;
		int [] randomArray = new int[10];
//		Random random = new Random(System.currentTimeMillis());
//			randomArray[i] = random.nextInt(10);
		
		for(int i = 0; i < randomArray.length; i++)
		{
			randomArray[i] = (int) (Math.random() * 10 + 1);

		}
		for(int i = 0; i < randomArray.length; i++)
		{
			System.out.print(randomArray[i] + " ");
		}
		System.out.println();
		
		
		max = randomArray[0];
		min = randomArray[0];
		for(int i = 0; i < randomArray.length; i++)
		{
			if(randomArray[i] > max)
			{
				max = randomArray[i];
			}
			if(randomArray[i] < min)
			{
				min = randomArray[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		return;
	}
	
	public void practice12() {
		System.out.println("12. 난수 배열 출력, 중복된 값이 없게 배열에 초기화");
		
		int [] randomArray =  new int[10];
		
		for(int i = 0; i < randomArray.length; i++)
			{
				randomArray[i] = (int)(Math.random() * 10 + 1);
				for(int j = 0; j < i; j++)
				{
					if(randomArray[j] == randomArray[i])
					{
						--i;
					}
					
				}
			}
		for(int i = 0; i < randomArray.length; i++)
			{
				System.out.print(randomArray[i] + " ");
			}
		System.out.println();
		return;
	}
	
	public void practice13() {
		System.out.println("13. 로또 번호 생성기, 중복값 없이 오름차순으로 정렬하여 출력");
		
		int [] lotto = new int[8];
		for(int i = 0; i < lotto.length; i++)
		{
			lotto[i] = (int) (Math.random() * 99 + 1);
			for(int j = 0; j < i; j++)
			{
				if(lotto[j] == lotto[i])
				{
					i--;
				}
			}
		}
		
		Arrays.sort(lotto);
		for(int i = 0; i < lotto.length; i++)
		{
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		return;
		
	}
	
	public void practice14() {
		System.out.println("14. 문자열 입력 받고 문자열에 어떤 문자가 들어갔는지"
				+ " 배열에 저장 후 문자 개수와 함께 출력");
	
		ArrayList<String> newArray = new ArrayList<>();
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		for(int i = 0; i < input.length(); i++)
			{
				if(!newArray.contains("" + input.charAt(i)))
						{
							newArray.add("" + input.charAt(i));
						}
			}
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < newArray.size(); i++)
			{
				System.out.print(newArray.get(i) + ", ");
			}
		
		System.out.println("\n문자 개수 : " + newArray.size());
		return;
			
		
		
		
	}
	
}
