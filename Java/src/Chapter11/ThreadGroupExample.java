package Chapter11;

public class ThreadGroupExample {
	//������ �׷��� �̿��� �ϰ� ���� ����
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		//myGroup�� �� �����带 ���Խ�Ŵ
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main ������ �׷��� list() �޼ҵ� ��� ���� ]");
		
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();//�ٽ�
		mainGroup.list();//�ٽ�
		
		System.out.println();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		
		System.out.println("[ myGroup ������ �׷��� interrupt() �޼ҵ� ȣ�� ]");
		myGroup.interrupt();//�ٽ�

	}

}
