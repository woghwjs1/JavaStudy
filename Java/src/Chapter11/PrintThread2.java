package Chapter11;

public class PrintThread2 extends Thread{
	//���� �ݺ��ؼ� ����ϴ� ������
	public void run() {
		try {
		while(true) {
			System.out.println("���� ��");
			Thread.sleep(1);	//InterruptedException �߻�
		} }catch(InterruptedException e) {}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
