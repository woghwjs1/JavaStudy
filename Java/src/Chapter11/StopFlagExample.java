package Chapter11;

public class StopFlagExample {
	//1초 후 출력 스레드를 중지시킴
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {	}
		
		printThread.setStop(true);

	}

}
