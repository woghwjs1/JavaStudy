package Chapter5;

public class Car2 {
	//Ŭ���� �ܺο��� �޼ҵ� ȣ��
	
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("�޸��ϴ�. ����ӵ� : " + speed);
		}
	}
	
}
