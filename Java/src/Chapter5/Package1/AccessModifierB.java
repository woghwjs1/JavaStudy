package Chapter5.Package1;	//��Ű�� ����

public class AccessModifierB {
	//Ŭ������ ���� ����
	AccessModifierA a; // (O) AŬ���� ���ٰ���(�ʵ�� ������ �� ����)
	
	//�ʵ�
	AccessModifierA a1 = new AccessModifierA(true);
	
	AccessModifierA a2 = new AccessModifierA(1);
	
	//AccessModifierA a3 = new AccessModifierA("���ڿ�"); //private ������ ���ٺҰ�
	
	public void AccessModifierB() {
		
	AccessModifierA a = new AccessModifierA();
	
	a.field1 = 1;
	
	a.field2 = 2;
	
	//a.field3 = 3; //private ���� �������� ���� �Ұ�
	
	a.method1();
	
	a.method2();
	
	//a.method3();	//private ���� �������� ���� �Ұ�
	}
}
