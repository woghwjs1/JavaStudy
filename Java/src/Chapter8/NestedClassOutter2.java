package Chapter8;

public class NestedClassOutter2 {
	//��ø Ŭ�������� �ٱ� Ŭ���� ���� ���
	
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			//��ø ��ü ����
			System.out.println(this.field);
			this.method();
			//�ٱ� ��ü ����
			System.out.println(NestedClassOutter2.this.field);
			NestedClassOutter2.this.method();
		}
	}
}
