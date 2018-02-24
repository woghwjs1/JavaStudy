package Chapter9;

public class TryCatchFinallyExample {
	//일반 예외 처리
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");	//예외 발생
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");	//대신 실행
		}
	}
}
