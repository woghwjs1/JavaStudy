package Chapter4;

public class AdvancedForExample {
		//���� for��
		public static void main(String[] args) {
			int[] scores = {95, 90, 70, 11, 48, 93};
			int sum = 0;
			
			for(int score : scores) {
				sum += score;
			}
			
			System.out.println("���� : " + sum);
			System.out.println("��� : " + sum/scores.length);
		}
}
