package Chapter8;

public class NestedClassOutter2Example {

	public static void main(String[] args) {
		//���� Ŭ����
		NestedClassOutter2 outter = new NestedClassOutter2();
		NestedClassOutter2.Nested nested = outter.new Nested();
		nested.print();

	}

}
