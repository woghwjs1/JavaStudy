package Chapter10;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	//�ζ� ��ȣ ���
	public static void main(String[] args) {
		//���� ��ȣ
		int[] selectNumber = new int[6];	//���ù�ȣ 6���� ����� �迭
		Random random = new Random(3);	//���� ��ȣ�� ��� ���� Random ��ü ����
		System.out.println("���� ��ȣ: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;	//���ù�ȣ�� ��� �迭�� ����
			System.out.println(selectNumber[i]+ " ");
		}
		System.out.println();
		
		//��÷��ȣ
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.println("��÷ ��ȣ: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) +1;
			System.out.println(winningNumber[i]+ " ");
		}
		System.out.println();
		
		//��÷����
		Arrays.sort(selectNumber);	//���� ����
		Arrays.sort(winningNumber);	//���� ����
		boolean result = Arrays.equals(selectNumber, winningNumber);//�� ��
		System.out.println("��÷ ����: ");
		if(result) {
			System.out.println("��÷�Ǿ����ϴ�.");
		}else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}

	}

}
