package Chapter11;

public class InterruptExample {
	//1�� �� ��� �����带 ������Ŵ
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try { Thread.sleep(1000); } catch (InterruptedException e) { }
		
		thread.interrupt();//�����带 �����Ű�� ���� InterruptedException�� �߻���Ŵ

	}

}
