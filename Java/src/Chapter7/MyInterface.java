package Chapter7;

public interface MyInterface {
	//���� �������̽�
	public void method1();
	
	//����Ʈ �޼ҵ�
	public default void method2() {
		System.out.println("MyInterface - method2() ����");
	}
}
