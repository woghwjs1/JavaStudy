package Chapter8;

public class NestedClassA3 {
	//맴버 클래스에서 사용 제한
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C{
		void method() {
			//인스턴스 필드와 메소드는 접근할 수 없다.
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
