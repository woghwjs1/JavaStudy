package Chapter6;

public class FieldCar2 {
	//����ȭ
	FieldTire[] tires = {
			new FieldTire("�տ���", 6),
			new FieldTire("�տ�����", 2),
			new FieldTire("�ڿ���", 3),
			new FieldTire("�ڿ�����", 4)
	};
	
	int run() {
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll() == false) {stop(); return i+1;}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("���� ����ϴ�.");
	}
}
