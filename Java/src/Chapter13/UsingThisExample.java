package Chapter13;

public class UsingThisExample {
	//���� Ŭ����
	public static void main(String... args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();

	}

}
