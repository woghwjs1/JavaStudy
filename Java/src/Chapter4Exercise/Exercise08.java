package Chapter4Exercise;

public class Exercise08 {
	//�־��� �迭�� ��ü �׸��� �հ� ��հ��� ���غ�����.(��ø for���� �̿��ϼ���.)
	public static void main(String[] args) {
		int[][] array= {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		
		double avg = 0.0;
		
		int avgValue = 0;
		
		//�ۼ� ��ġ
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
