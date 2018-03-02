package Chapter11;

public class JoinExample {
	//다른 스레드가 종료 될때까지 일시 정지 상태 유지
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();	//SumThread가 종료할 때까지 메인 스레드를 일시 정지시킴
		} catch (InterruptedException e) { }
		
		System.out.println("1-100까지의 합: " + sumThread.getSum());

	}

}
