package Chapter5;

public class StaticUse {
	//정적 맴버 사용
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
