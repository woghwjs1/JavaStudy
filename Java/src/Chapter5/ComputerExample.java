package Chapter5;

public class ComputerExample {
	//매개 변수의 수를 모를 경우
	public static void main(String[] args) {
		Computer com = new Computer();
		
		int[] values = {1, 2, 3};
		int result1 = com.sum1(values);
		System.out.println(result1);
		
		values = new int[]{1, 2, 3, 4, 5};
		int result2 = com.sum1(values);
		System.out.println(result2);
		
		values = new int[]{1, 2, 3};
		int result3 = com.sum2(values);
		System.out.println(result3);
		
		values = new int[]{1, 2, 3, 4, 5};
		int result4 = com.sum2(values);
		System.out.println(result4);
		
		

	}

}
