package Chapter6;

public abstract class AbstractAnimal {
	//�߻� �޼ҵ� ����
	
	public String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound();	//�߻�޼ҵ�
}
