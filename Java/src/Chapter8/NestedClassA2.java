package Chapter8;

public class NestedClassA2 {
	//�ٱ� �ʵ�� �޼ҵ忡�� ��� ����
	
	//�ν��Ͻ� �ʵ�
	B field1 = new B();
	C field2 = new C();
	
	//�ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//���� �ʵ�
	//static B field3 = new B();
	static C field4 = new C();
		
	//���� �޼ҵ�
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}	
	
	//�ν��Ͻ� �ɹ� Ŭ����
	class B{
		
	}
	
	//���� �ɹ� Ŭ����
	static class C{
		
	}
}
