package Chapter11;

public class ConsumerThread extends Thread{
	//�����͸� �Һ��ϴ�(�д�) ������
	private DataBox dataBox;
	
	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;		//���� ��ü �ʵ忡 ����
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			String data = dataBox.getData();	//���ο� �����͸� ����
		}
	}

}
