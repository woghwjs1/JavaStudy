package Chapter11;

public class JoinExample {
	//�ٸ� �����尡 ���� �ɶ����� �Ͻ� ���� ���� ����
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();	//SumThread�� ������ ������ ���� �����带 �Ͻ� ������Ŵ
		} catch (InterruptedException e) { }
		
		System.out.println("1-100������ ��: " + sumThread.getSum());

	}

}
