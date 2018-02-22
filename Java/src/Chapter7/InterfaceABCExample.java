package Chapter7;

public class InterfaceABCExample {
	//호출 가능 메소드
	public static void main(String[] args) {
		ImplementationC imp = new ImplementationC();
		
		InterfaceA ia = imp;
		ia.method1();
		System.out.println("InterfaceA는 method1만 있기때문에 method1만 호출가능");
		
		InterfaceB ib = imp;
		ib.method2();
		System.out.println("InterfaceB는 method2만 있기때문에 method2만 호출가능");
		
		InterfaceC ic = imp;
		ic.method1();
		ic.method2();
		ic.method3();
		System.out.println("InterfaceC는 InterfaceA,B를 상속받았기 때문에 모두 호출가능");
	}
}
