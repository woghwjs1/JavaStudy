package Chapter5.Package2;	//��Ű���� �ٸ�

import Chapter5.Package1.*;

public class AccessModifierC {
	//Ŭ������ ���� ����
	AccessModifierA a;
	AccessModifierB b;
	
	//�ʵ�
	AccessModifierA a1 = new AccessModifierA(true);     //public ������������ ���ٰ���	
	
	//AccessModifierA a2 = new AccessModifierA(1);	    //������ ������������ ���� �ٸ���Ű������ ���� �Ұ�
	
	//AccessModifierA a3 = new AccessModifierA("���ڿ�"); //private ���� �������� �ƿ� ������ �Ұ�
	
	public void AccessModifierC() {
		AccessModifierA a = new AccessModifierA();
		
		a.field1 = 1;
		//a.field2 = 2;	//default ���� �����̶� ��Ű���� �޶� ���ٺҰ�
		//a.field3 = 3;	//private ���� ����
		
		a.method1();
		//a.method2();	//default ���� �����̶� ��Ű���� �޶� ���ٺҰ�
		//a.method3();	//private ���� ����
	}
}
