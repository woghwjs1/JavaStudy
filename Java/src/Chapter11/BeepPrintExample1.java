package Chapter11;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	//���� �����常 �̿��� ���
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);/*0.5�ʰ� ����*/} catch (Exception e) {	}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); /*0.5�ʰ� ����*/} catch (Exception e) { }
		}

	}

}
