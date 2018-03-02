package Chapter11;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	//메인 스레드만 이용한 경우
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);/*0.5초간 정지*/} catch (Exception e) {	}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); /*0.5초간 정지*/} catch (Exception e) { }
		}

	}

}
