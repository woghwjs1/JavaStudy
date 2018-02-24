package Chapter9;

public class ThrowsExample {
	//예외 처리 떠넘기기
	public static void main(String[] args) {
		try {
			method();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}
	
	public static void method() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}

}
