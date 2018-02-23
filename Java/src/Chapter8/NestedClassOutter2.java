package Chapter8;

public class NestedClassOutter2 {
	//중첩 클래스에서 바깥 클래스 참조 얻기
	
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			//중첩 객체 참조
			System.out.println(this.field);
			this.method();
			//바깥 객체 참조
			System.out.println(NestedClassOutter2.this.field);
			NestedClassOutter2.this.method();
		}
	}
}
