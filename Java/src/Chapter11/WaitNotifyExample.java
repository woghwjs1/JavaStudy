package Chapter11;

public class WaitNotifyExample {
	//�� �����带 �����ϰ� �����ϴ� ���� ������
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();	//���� ��ü ����
		
		ThreadE threadE = new ThreadE(workObject);	//������ ����
		ThreadF threadF = new ThreadF(workObject);	//������ ����
		
		threadE.start();	//����
		threadF.start();	//����
		

	}

}
