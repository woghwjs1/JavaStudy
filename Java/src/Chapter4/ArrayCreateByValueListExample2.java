package Chapter4;

public class ArrayCreateByValueListExample2 {
	//값의 리스트로 배열 생성
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for(int i=0; i<scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("sum1 총합 : " + sum1);
		
		int sum2 = add(new int[] {83,90,87});
		System.out.println("sum2 총합 : " + sum2);

	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		return sum;
	}

}
