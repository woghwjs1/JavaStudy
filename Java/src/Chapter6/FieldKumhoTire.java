package Chapter6;

public class FieldKumhoTire extends FieldTire{
	//FieldTire�� �ڽ� Ŭ����
	
	//�ʵ�
	
	//������
	public FieldKumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire ���� : " + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("Ÿ�̾� ��ũ " + location);
			return false;
		}
	}
}