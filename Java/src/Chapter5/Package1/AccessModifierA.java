package Chapter5.Package1;

public class AccessModifierA { //Default ��������(�ٸ���Ű���� �Ҽӵ� Ŭ������ ���ٺҰ�)
	//Ŭ������ ���� ����
	
	//�ʵ�
	AccessModifierA a1 = new AccessModifierA(true);
	
	AccessModifierA a2 = new AccessModifierA(1);
	
	AccessModifierA a3 = new AccessModifierA("���ڿ�");
	
	public int field1;
	
	int field2;
	
	private int field3;
	
	//������
	public AccessModifierA(boolean b) {}	//public ���� ����
	
	AccessModifierA(int b){}				//default ���� ����
	
	private AccessModifierA(String s) {}	//private ���� ����
	
	public AccessModifierA() { //Ŭ���� ������ ��� ������������ ������ ���� �ʴ´�.
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	//�޼ҵ�(�������� ����)
	public void method1() {	} 
	
	void method2() { }
	
	private void method3() { }
	
}
