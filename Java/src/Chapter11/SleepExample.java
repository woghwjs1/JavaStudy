package Chapter11;

import java.awt.Toolkit;

public class SleepExample {
	//3�� �ֱ�� 10�� ������ �߻�
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try { Thread.sleep(3000);/*0.5�ʰ� ����*/} catch (Exception e) {	}
		}
	}

}
