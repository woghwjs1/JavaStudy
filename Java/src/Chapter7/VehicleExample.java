package Chapter7;

public class VehicleExample {
	//���� Ÿ�� ��ȯ
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); //Vehicle �������̽����� �� �޼ҵ尡 ����
		
		Bus bus = (Bus) vehicle;	//���� Ÿ�� ��ȯ
		bus.run();
		bus.checkFare();	//BusŬ�������� �� �޼ҵ尡 �ֽ�

	}

}
