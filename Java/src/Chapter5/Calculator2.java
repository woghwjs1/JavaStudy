package Chapter5;

public class Calculator2 {
	//클래스 내부에서 메소드 호출
		int plusA(int x, int y) {
			int result = x + y;
			return result;
		}
		
		double avg(int x, int y) {
			double sum = plusA(x, y);
			double result = sum /2;
			return result;
		}
		
		void execute() {
			double result = avg(6, 7);
			println("실행결과 : " + result);
		}
		
		void println(String message) {
			System.out.println(message);
		}
}
