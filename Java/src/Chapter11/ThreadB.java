package Chapter11;

public class ThreadB extends Thread{
	//ThreadB Ŭ����
	public void run() {	//������B ���� ����
		for(int i=0; i<2; i++) {
			System.out.println(getName()/*������ �̸����*/ + "�� ����ϴ� ����");
		}
	}
}