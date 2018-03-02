package Chapter11;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	//버프음을 들려주는 작업 정의
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);/*0.5초간 정지*/} catch (Exception e) {	}
		}
	}

}
