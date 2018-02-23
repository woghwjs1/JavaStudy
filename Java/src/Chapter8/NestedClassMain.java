package Chapter8;

public class NestedClassMain {
	//중첩 클래스 객체 생성
	public static void main(String[] args) {
		
		NestedClassA1 a = new NestedClassA1();
		
		//인스턴스 맴버 클래스 객체 생성
		NestedClassA1.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 맴버 클래스 객체 생성
		NestedClassA1.C c = new NestedClassA1.C();
		c.field1 = 3;
		c.method1();
		NestedClassA1.C.field2 = 3;
		NestedClassA1.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
		

	}

}
