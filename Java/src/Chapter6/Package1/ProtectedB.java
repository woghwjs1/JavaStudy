package Chapter6.Package1;

public class ProtectedB {
	//protected ���� ������ �׽�Ʈ
	public void method() {
		ProtectedA a = new ProtectedA();
		a.field = "value";	//���� ��Ű���ȿ� �����Ƿ� ��� �� �۵��ȴ�.
		a.method();
	}
}
