package Chapter5;

public class Calculator2 {
	//Ŭ���� ���ο��� �޼ҵ� ȣ��
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
			println("������ : " + result);
		}
		
		void println(String message) {
			System.out.println(message);
		}
}
