package Chapter11;

public class TargetThread extends Thread{
	//Ÿ�� ������
	public void run() {
		for(long i=0; i<10000000; i++) {}
		
		try {
			//1.5�ʰ� �Ͻ� ����
			Thread.sleep(1500);
		} catch (Exception e) {	}
		
		for(long i=0; i<10000000; i++) {}
	}
}
