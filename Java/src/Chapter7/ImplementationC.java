package Chapter7;

public class ImplementationC implements InterfaceC{
	//하위 인터페이스 구현
	
	//InterfaceA, InterfaceB의 실체 메소드도 있어야한다. InterfaceC가 A,B를 상속받앗기 때문이다.
	public void method1() {
		System.out.println("ImplementationC - method1() 실행");
	}
	
	public void method2() {
		System.out.println("ImplementationC - method2() 실행");
	}
	
	public void method3() {
		System.out.println("ImplementationC - method3() 실행");
	}
}
