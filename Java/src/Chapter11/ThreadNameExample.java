package Chapter11;

public class ThreadNameExample {
	//���� ������ �̸� ��� �� UserThread ���� �� ����
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();	//�� �ڵ带 �����ϴ� ������ ��ü ���
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();	//������ ����
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		threadA.start();	//������A ����
		
		ThreadB threadB = new ThreadB();	//������ ����
		System.out.println("�۾� ������ �̸�: " + threadB.getName());
		threadB.start();	//������B ����

	}

}
