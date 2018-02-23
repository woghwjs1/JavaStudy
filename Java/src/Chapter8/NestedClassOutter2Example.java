package Chapter8;

public class NestedClassOutter2Example {

	public static void main(String[] args) {
		//실행 클래스
		NestedClassOutter2 outter = new NestedClassOutter2();
		NestedClassOutter2.Nested nested = outter.new Nested();
		nested.print();

	}

}
