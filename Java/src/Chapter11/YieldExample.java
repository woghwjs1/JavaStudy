package Chapter11;

public class YieldExample {
	//������ ���� �纸 ����
	public static void main(String[] args) {
		ThreadC threadC = new ThreadC();
		ThreadD threadD = new ThreadD();
		threadC.start();
		threadD.start();
		
		try { Thread.sleep(3000);/*3�ʰ� ����*/} catch (Exception e) {	}
		threadC.work = false;	//������C�� ����
		
		try { Thread.sleep(3000);/*3�ʰ� ����*/} catch (Exception e) {	}
		threadC.work = true;	//������C,D �Ѵ� ����
		
		try { Thread.sleep(3000);/*3�ʰ� ����*/} catch (Exception e) {	}
		threadC.stop = true;	//������C,D �Ѵ� ����
		threadD.stop = true;

	}

}
