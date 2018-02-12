package Chapter4Exercise;

public class Exercise08 {
	//주어진 배열의 전체 항목의 합과 평균값을 구해보세요.(중첩 for문을 이용하세요.)
	public static void main(String[] args) {
		int[][] array= {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		
		double avg = 0.0;
		
		int avgValue = 0;
		
		//작성 위치
		for(int i=0; i<array.length; i++) {
			for(int x=0; x<array[i].length; x++) {
				sum += array[i][x];
				avgValue++;
			}
		}
		avg = (double) sum/avgValue;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		

	}

}
