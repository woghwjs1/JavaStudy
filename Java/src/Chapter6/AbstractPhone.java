package Chapter6;

public abstract class AbstractPhone {
	// �߻� Ŭ����
	
	//�ʵ�
	public String owner;
	
	//������
	public AbstractPhone(String owner) {
		this.owner = owner;
	}
	
	//�޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
