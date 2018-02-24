package Chapter9;

public class MultiCatchExample {
	//Multi catch
	public static void main(String[] args) {

		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " : " + result);
		} catch (NumberFormatException | ClassCastException e) { //다중 캐치선언문이다.
			System.out.println("숫자로 변환 불가이거나 타입 변환이 불가능합니다.");
		} catch (Exception e) {
			System.out.println("실행 방법");
			System.out.print("java ArrayIndexOutOfBoundsExceptionExample ");
			System.out.print("값1  값2");
		} finally {
			System.out.println(" 다시 실행하세요. ");
		}
		
	}
}