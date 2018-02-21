package Chapter6.Package1;

public class ProtectedB {
	//protected 접근 제한자 테스트
	public void method() {
		ProtectedA a = new ProtectedA();
		a.field = "value";	//같은 패키지안에 있으므로 모두 잘 작동된다.
		a.method();
	}
}
