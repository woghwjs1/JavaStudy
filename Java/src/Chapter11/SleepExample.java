package Chapter11;

import java.awt.Toolkit;

public class SleepExample {
	//3초 주기로 10번 비프음 발생
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try { Thread.sleep(3000);/*0.5초간 정지*/} catch (Exception e) {	}
		}
	}

}
