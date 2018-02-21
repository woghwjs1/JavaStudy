package Chapter6.Package2;

import Chapter6.Package1.*;

public class ProtectedD extends ProtectedA{
	//protected 접근 제한자
	public ProtectedD() {
		super();
		this.field = "value";
		this.method();
	}
}
