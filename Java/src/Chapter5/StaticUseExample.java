package Chapter5;

public class StaticUseExample {
	//정적 맴버 사용
	public static void main(String[] args) {
		double result1 = 10 * 10 * StaticUse.pi;
		int result2 = StaticUse.plus(10, 20);
		int result3 = StaticUse.minus(20, 10);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
