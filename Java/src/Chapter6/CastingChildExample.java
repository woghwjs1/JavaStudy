package Chapter6;

public class CastingChildExample {

	public static void main(String[] args) {
		CastingParent parent = new CastingChild();	//�ڵ� Ÿ�� ��ȯ
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.method3();				//(�θ�Ŭ������ �����Ƿ� �Ұ���)
		//parent.field2 = "data2";		//(�θ�Ŭ������ �����Ƿ� �Ұ���)
		
		CastingChild child = (CastingChild) parent; //���� Ÿ�� ��ȯ
		
		child.field2 = "data2";
		child.method3();

	}

}
