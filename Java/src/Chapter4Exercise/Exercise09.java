package Chapter4Exercise;

import java.util.Scanner;

public class Exercise09 {
	//������ Ű����κ��� �л��� ���� �� �л����� ������ �Է¹޾Ƽ�, �ְ� ���� �� ��� ������ ���ϴ� ���α׷� �Դϴ�.
	//���� ����� ����, �˸°� �ۼ��غ�����(����� 16���ο��� Scanner�� newxtInt() �޼ҵ�� �ֿܼ� �Էµ�
	//���ڸ� �а� �����մϴ�.)
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.�л���|2.�Է�|3.����Ʈ|4.�м�|5.����");
			System.out.println("------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			//�ۼ���ġ
			if(selectNo == 1) {
				System.out.print("�л���> ");
				selectNo = scanner.nextInt();
				studentNum = selectNo;
			}else if(selectNo == 2){
				scores = new int[studentNum];
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "] : ");
					selectNo = scanner.nextInt();
					scores[i] = selectNo;
				}
			}else if(selectNo == 3){
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			}else if(selectNo == 4){
				int max = 0;
				int sum = 0;
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("���� ���� : " + sum);
				System.out.println("���� ��� : " + (double)sum/studentNum);
				System.out.println("�ְ� ���� : " + max);
			}else if(selectNo == 5){
				run = false;
			}
		}
		
		System.out.println("���α׷��� �����մϴ�.");

	}

}
