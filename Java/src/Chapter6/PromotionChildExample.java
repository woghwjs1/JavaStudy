package Chapter6;

public class PromotionChildExample {
	//�ڵ� Ÿ�� ��ȯ ���� �ɹ� ����
	public static void main(String[] args) {
		PromotionChild child = new PromotionChild();
		
		PromotionParent parent = child;	//�ڵ� Ÿ�� ��ȯ
		
		parent.method1();	
		parent.method2();	//�����ǵ� �޼ҵ尡 ȣ���
		//parent.method3();	//ȣ�� �Ұ���
	}
}
