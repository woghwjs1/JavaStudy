package Chapter11;

public class BeepPrintExample2 {
	//���� ������� �۾� �����尡 ���ÿ� ����
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); /*0.5�ʰ� ����*/} catch (Exception e) { }
		}

	}

}
