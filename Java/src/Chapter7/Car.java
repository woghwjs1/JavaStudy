package Chapter7;

public class Car {
	//�ʵ� ������
	
	//�������̽� Ÿ�� �ʵ� ����� �ʱ� ���� ��ü ����
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	//�޼ҵ�
	void run() {	//�������̽����� ����� roll() �޼ҵ� ȣ��
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
