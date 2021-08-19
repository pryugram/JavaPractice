package note.ownpractice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
	Scanner sc = new Scanner(System.in);
	
	public void practice4() {
		System.out.println("4. ���ڿ����� ���� ã��");
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		System.out.print("���� : ");
		char inputChar = sc.next().charAt(0);
		int count = 0;
		char[] chaArray = str.toCharArray();
		
		
		System.out.print(str + "�� " + inputChar + "�� �����ϴ� ��ġ : ");
		for(int i = 0; i < chaArray.length ; i++)
		{
			chaArray[i] = str.charAt(i);
			if(chaArray[i] == inputChar)
			{
				System.out.print(i + ", ");
				count++;
			}
		}
		
		System.out.println("\n" + inputChar + "���� : " + count);
		
		
	}
	
	public void practice5() {
		System.out.println("5. ���� ���");
//		while(true)
//		{
//		System.out.print("0 ~ 6 ������ ���� �Է� : ");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		String [] dayArr = new String[] {"������","ȭ����","������","�����","�ݿ���","�����","�Ͽ���"};
//
//		if(num > -1 && num < 7)
//		{
//			System.out.println(dayArr[num]);
//			break;
//		}
//		else
//		{
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//			continue;
//		}
//		}
		String[] dayArray = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int inputNum = Integer.parseInt(sc.nextLine());
		
		if(inputNum < 0 || inputNum > 6) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		System.out.println(dayArray[inputNum]);
		return;
		
	}

	public void practice6() {
		System.out.println("6. �迭 �Է�");
		System.out.print("���� : ");
		
		int num = Integer.parseInt(sc.nextLine());
		int [] numArr = new int[num];
		int sum = 0;
		
		
		for(int i = 0; i < numArr.length; i++)
		{
			System.out.print("�迭" + (i+1) + "��° �ε����� ���� �� : ");
			numArr[i] = Integer.parseInt(sc.nextLine());
		}
		for(int i = 0; i < numArr.length; i++)
		{
			System.out.print(numArr[i] + " ");
			sum += numArr[i];
		}
		System.out.println("���� : " + sum);
		return;
	}
	
	public void practice7() {
		System.out.println("7. ��������, ������������ �����Ǵ� �迭�� Ȧ���� �Է� �ޱ�");
		int num = 0;
		while(true)
		{
			System.out.print("Ȧ���� ���� : ");
			num = Integer.parseInt(sc.nextLine());
			
			if(num % 2 == 0)
			{
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
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
		System.out.println("8. �迭 ������ �˻�");
		String [] chickenArray = new String [] {"�Ķ��̵�", "���", "����", "�Ҵ�"};
		
		while(true)
		{
			System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
			String chicken = sc.nextLine();
			
			for(int i = 0; i < chickenArray.length; i++)
			{
				if(chickenArray[i].equals(chicken))
				{
					System.out.println(chicken + "ġŲ ��� ����");
					return;
				}
			}
			
			System.out.println(chicken + "ġŲ�� ���� �޴��Դϴ�.");
			return;
			
		}
	}
	
	public void practice9() {
		System.out.println("9. �ֹε�Ϲ�ȣ ���");
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
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
		System.out.println("10. ���� �迭 ���");
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
		System.out.println("11. ���� �迭 ��� �� �ִ밪, �ּҰ� ���");
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
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		return;
	}
	
	public void practice12() {
		System.out.println("12. ���� �迭 ���, �ߺ��� ���� ���� �迭�� �ʱ�ȭ");
		
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
		System.out.println("13. �ζ� ��ȣ ������, �ߺ��� ���� ������������ �����Ͽ� ���");
		
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
		System.out.println("14. ���ڿ� �Է� �ް� ���ڿ��� � ���ڰ� ������"
				+ " �迭�� ���� �� ���� ������ �Բ� ���");
	
		ArrayList<String> newArray = new ArrayList<>();
		System.out.print("���ڿ� : ");
		String input = sc.nextLine();
		
		for(int i = 0; i < input.length(); i++)
			{
				if(!newArray.contains("" + input.charAt(i)))
						{
							newArray.add("" + input.charAt(i));
						}
			}
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		for(int i = 0; i < newArray.size(); i++)
			{
				System.out.print(newArray.get(i) + ", ");
			}
		
		System.out.println("\n���� ���� : " + newArray.size());
		return;
			
		
		
		
	}
	
}
