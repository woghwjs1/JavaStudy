package Chapter5;

public class GetterSetterExample {
	//Getter�� Setter�� �޼ҵ� ���
	public static void main(String[] args) {
		GetterSetter GS = new GetterSetter();
		
		//�߸��� �ӵ� ����
		GS.setSpeed(-50);
		System.out.println("�߸��� �ӵ� ����(-50) : " + GS.getSpeed());
		
		//�ùٸ� �ӵ� ����
		GS.setSpeed(50);
		System.out.println("�ùٸ� �ӵ� ����( 50) : " + GS.getSpeed());
		
		//����
		if(!GS.isStop()) {
			GS.setStop(true);
		}
		System.out.println("���� �� �ӵ� : " + GS.getSpeed());
	}

}
