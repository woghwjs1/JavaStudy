package Chapter11;

public class PrintThread2 extends Thread{
	//무한 반복해서 출력하는 스레드
	public void run() {
		try {
		while(true) {
			System.out.println("실행 중");
			Thread.sleep(1);	//InterruptedException 발생
		} }catch(InterruptedException e) {}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
