package Chapter7;

public class InterfaceABCExample {
	//ȣ�� ���� �޼ҵ�
	public static void main(String[] args) {
		ImplementationC imp = new ImplementationC();
		
		InterfaceA ia = imp;
		ia.method1();
		System.out.println("InterfaceA�� method1�� �ֱ⶧���� method1�� ȣ�Ⱑ��");
		
		InterfaceB ib = imp;
		ib.method2();
		System.out.println("InterfaceB�� method2�� �ֱ⶧���� method2�� ȣ�Ⱑ��");
		
		InterfaceC ic = imp;
		ic.method1();
		ic.method2();
		ic.method3();
		System.out.println("InterfaceC�� InterfaceA,B�� ��ӹ޾ұ� ������ ��� ȣ�Ⱑ��");
	}
}
