package Chapter7;

public class MyInterfaceExample {
	//디폴트 메소드 사용
	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();

	}

}
