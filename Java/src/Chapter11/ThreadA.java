package Chapter11;

public class ThreadA extends Thread{
	//ThreadA Ŭ����
	public ThreadA() {
		setName("ThreadA");	//������ �̸� ����
	}
	
	public void run() {	//������A ���� ����
		for(int i=0; i<2; i++) {
			System.out.println(getName()/*������ �̸����*/ + "�� ����ϴ� ����");
		}
	}
}
