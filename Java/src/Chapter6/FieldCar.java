package Chapter6;

public class FieldCar {
	//Ÿ�̾ ��ǰ���� ������ Ŭ����
	
	//�ʵ�
	FieldTire frontLeftTire = new FieldTire("�տ���", 6);
	FieldTire frontRightTire = new FieldTire("�տ�����", 2);
	FieldTire backLeftTire = new FieldTire("�ڿ���", 4);
	FieldTire backRightTire = new FieldTire("�ڿ�����", 3);
	
	//������
	
	//�޼ҵ�
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(frontLeftTire.roll() == false) {stop(); return 1;}
		if(frontRightTire.roll() == false) {stop(); return 2;}
		if(backLeftTire.roll() == false) {stop(); return 3;}
		if(backRightTire.roll() == false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
