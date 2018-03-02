package Chapter11;

public class WorkThread extends Thread{
	//InterruptedException�� �߻��� �� ����ǵ��� ��
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);	//������ �׷�� ������ �̸��� ����
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {	
				//InterruptedException�� �߻��� �� while���� �������� �����带 �����Ŵ
				System.out.println(getName() + " Interrupted");
				break;
			}
		}
		System.out.println(getName() + " �����");
	}
}
