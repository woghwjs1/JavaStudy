package Chapter11;

public class DaemonExample {
	//���� �����尡 �����ϴ� �ڵ�
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);//AutoSaveThread�� ���� ������� ����
		autoSaveThread.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		
		System.out.println("���� ������ ����");

	}

}
