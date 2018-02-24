package Chapter9;

public class CatchOrderExample {
	//catch 블록의 순서
	//순서를 설정할 때는 상위 예외 클래스가 하위 예외 클래스 보다 아래에 위치해야 한다.
	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " : " + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환 불가");
		} catch (Exception e) {
			System.out.println("실행 방법");
			System.out.print("java ArrayIndexOutOfBoundsExceptionExample ");
			System.out.print("값1  값2");
		} finally {
			System.out.println(" 다시 실행하세요. ");
		}
		
	}
}