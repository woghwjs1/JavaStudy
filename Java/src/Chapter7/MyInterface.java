package Chapter7;

public interface MyInterface {
	//기존 인터페이스
	public void method1();
	
	//디폴트 메소드
	public default void method2() {
		System.out.println("MyInterface - method2() 실행");
	}
}
