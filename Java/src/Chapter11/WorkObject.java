package Chapter11;

public class WorkObject {
	//�� �������� �۾� ������ ����ȭ �޼ҵ�� �ۼ��� ���� ��ü
	public synchronized void methodA() {
		System.out.println("ThreadE�� methodA() �۾� ����");
		notify();//�Ͻ� ���� ���¿� �ִ� ThreadF�� ���� ��� ���·� ����
		try {
			wait();	//ThreadE�� �Ͻ� ���� ���·� ����
		} catch (Exception e) {	}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadF�� methodB() �۾� ����");
		notify();//�Ͻ� ���� ���¿� �ִ� ThreadE�� ���� ��� ���·� ����
		try {
			wait();	//ThreadF�� �Ͻ� ���� ���·� ����
		} catch (Exception e) {	}
	}
	
}
