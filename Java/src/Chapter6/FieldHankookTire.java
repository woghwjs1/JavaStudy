package Chapter6;

public class FieldHankookTire extends FieldTire{
	//FieldTire�� �ڽ� Ŭ����
	
	//�ʵ�
	
	//������
	public FieldHankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "hankookTire ���� : " + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("Ÿ�̾� ��ũ " + location);
			return false;
		}
	}
}
