package Chapter8;

public class NestedClassMain {
	//��ø Ŭ���� ��ü ����
	public static void main(String[] args) {
		
		NestedClassA1 a = new NestedClassA1();
		
		//�ν��Ͻ� �ɹ� Ŭ���� ��ü ����
		NestedClassA1.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//���� �ɹ� Ŭ���� ��ü ����
		NestedClassA1.C c = new NestedClassA1.C();
		c.field1 = 3;
		c.method1();
		NestedClassA1.C.field2 = 3;
		NestedClassA1.C.method2();
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
		

	}

}
