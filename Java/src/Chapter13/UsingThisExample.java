package Chapter13;

public class UsingThisExample {
	//실행 클래스
	public static void main(String... args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();

	}

}
