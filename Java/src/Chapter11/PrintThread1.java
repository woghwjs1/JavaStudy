package Chapter11;

public class PrintThread1 extends Thread{
	//���� �ݺ��ؼ� ����ϴ� ������
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("���� ��");
		}
		System.out.println("�ڿ� ����");	//stop�� true�� �ɶ�
		System.out.println("���� ����");	//stop�� true�� �ɶ�
	}
}
