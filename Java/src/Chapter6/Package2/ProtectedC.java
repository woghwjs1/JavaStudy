package Chapter6.Package2;

import Chapter6.Package1.*;

public class ProtectedC {
	// protected 접근 제한자 테스트
	public void method() {
		//ProtectedA a = new ProtectedA();
		//a.field = "value";	//패키지가 다르므로 전부 호출이 불가능하다.
		//a.method();
	}
}
