package Chapter11;

public class BeepPrintExample3 {
	//���� ������� �۾� �����尡 ���ÿ� ����
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); /*0.5�ʰ� ����*/} catch (Exception e) { }
		}

	}

}
