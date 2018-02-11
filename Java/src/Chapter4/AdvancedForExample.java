package Chapter4;

public class AdvancedForExample {
		//Çâ»óµÈ for¹®
		public static void main(String[] args) {
			int[] scores = {95, 90, 70, 11, 48, 93};
			int sum = 0;
			
			for(int score : scores) {
				sum += score;
			}
			
			System.out.println("ÃÑÇÕ : " + sum);
			System.out.println("Æò±Õ : " + sum/scores.length);
		}
}
