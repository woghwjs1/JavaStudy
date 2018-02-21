package Chapter6;

public class InstanceofExample {
	//��ü Ÿ�� Ȯ��
	public static void method1(InstanceofParent parent) {
		if(parent instanceof InstanceofChild) {
			InstanceofChild child = (InstanceofChild) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		}else {
			System.out.println("method1 - Child�� ��ȯ ����");
		}
	}
	
	public static void method2(InstanceofParent parent) {
		InstanceofChild child = (InstanceofChild) parent;	//ClassCastException�� �߻��� ���ɼ��� �ֽ�.
		System.out.println("method2 - Child�� ��ȯ ����");
	}
	
	public static void main(String[] args) {
		InstanceofParent parentA = new InstanceofChild();
		method1(parentA);
		method2(parentA);
		
		InstanceofParent parentB = new InstanceofParent();
		method1(parentB);
		method2(parentB);	//���� �߻�
	}
	
}
