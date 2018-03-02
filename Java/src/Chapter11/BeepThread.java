package Chapter11;

import java.awt.Toolkit;

public class BeepThread extends Thread{
	//비프음 들려주는 스레드
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);/*0.5초간 정지*/} catch (Exception e) {	}
		}
	}
}
