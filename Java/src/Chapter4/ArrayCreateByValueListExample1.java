package Chapter4;

public class ArrayCreateByValueListExample1 {
	//�� ������� �迭 ����
	public static void main(String[] args) {
		int[] scores = {90, 80, 70};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("���� �հ� : " + sum);
		
		double avg = sum/scores.length;
		
		System.out.println("���� ��� : " + avg);

	}

}
