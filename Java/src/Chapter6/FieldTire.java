package Chapter6;

public class FieldTire {
	//Ÿ�̾� Ŭ����
	
	//�ʵ�
	public int maxRotation;			//�ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation;	//���� ȸ����
	public String location;			//Ÿ�̾� ��ġ
	
	//������
	public FieldTire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println("Ÿ�̾� ���� : " + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("*** " + location + "Tire ��ũ ***");
			return false;
		}
	}
	
	
}
