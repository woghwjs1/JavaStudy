package Chapter6;

public class AbstractSmartPhone extends AbstractPhone{
	//��ü Ŭ����
	
	//������
	public AbstractSmartPhone(String owner) {
		super(owner);
	}
	
	//�޼ҵ�
	public void internetSearch() {
		System.out.println("���ͳ��� �˻��մϴ�.");
	}

}
