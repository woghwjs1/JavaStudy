package Chapter9;

public class TryCatchFinallyRuntimeExceptionExample {
	//실행 예외 처리
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = "100";//args[0];
			data2 = "300";//args[1];
		} catch(Exception e) {
			System.out.println("실행 방법");
			System.out.print("java ArrayIndexOutOfBoundsExceptionExample ");
			System.out.print("값1  값2");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " : " + result);
		} catch (Exception e) {
			System.out.println("숫자로 변환 불가");
		} finally {
			System.out.println(" 다시 실행하세요. ");
		}
	}
}
