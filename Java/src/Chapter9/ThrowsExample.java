package Chapter9;

public class ThrowsExample {
	//���� ó�� ���ѱ��
	public static void main(String[] args) {
		try {
			method();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}

	}
	
	public static void method() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}

}
