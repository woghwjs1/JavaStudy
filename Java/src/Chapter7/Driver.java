package Chapter7;

public class Driver {
	//�Ű� ������ �������̽�ȭ
	public void driver(Vehicle vehicle) {
		//��ü Ÿ�� Ȯ��
		if(vehicle instanceof Bus) {	//vehicle �Ű� ������ �����ϴ� ��ü�� Bus���� ����
			Bus bus = (Bus) vehicle;	//Bus ��ü�� ��� �����ϰ� ���� Ÿ�� ��ȯ��Ŵ
			bus.checkFare();			//���� ��ȯ�ϴ� ����. �� �޼ҵ带 ȣ���ϱ� ����
		}
		
		vehicle.run();
	}
}
