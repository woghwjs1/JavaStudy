package Chapter6;

public class FieldCarExample {
	//���� Ŭ����
	public static void main(String[] args) {
		FieldCar car = new FieldCar();
		
		for(int i=1; i<=10; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("�տ��� Ÿ�̾ �ѱ�Ÿ�̾�� ��ü");
					car.frontLeftTire = new FieldHankookTire("�տ���", 15);
					break;
				case 2:
					System.out.println("�տ����� Ÿ�̾ ��ȣŸ�̾�� ��ü");
					car.frontRightTire = new FieldKumhoTire("�տ�����", 15);
					break;
				case 3:
					System.out.println("�ڿ��� Ÿ�̾ �ѱ�Ÿ�̾�� ��ü");
					car.backLeftTire = new FieldHankookTire("�ڿ���", 15);
					break;
				case 4:
					System.out.println("�ڿ����� Ÿ�̾ ��ȣŸ�̾�� ��ü");
					car.backRightTire = new FieldKumhoTire("�ڿ�����", 15);
					break;
			}
			System.out.println("--------------------");
		}
	}
}
