package Chapter11;

public class ThreadD extends Thread{
	//������ ���� �纸 ����
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {	//stop�� true�� �Ǹ� ��������
			if(work) {
				System.out.println("ThreadD �۾� ����");
			}else{
				Thread.yield();	//work�� false�� �Ǹ� �ٸ� �����忡�� ���� �纸
			}
		}
		System.out.println("ThreadD ����");
	}
}
