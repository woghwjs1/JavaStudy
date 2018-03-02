package Chapter11;

public class ThreadC extends Thread{
	//스레드 실행 양보 예제
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {	//stop이 true가 되면 실행종료
			if(work) {
				System.out.println("ThreadC 작업 내용");
			}else{
				Thread.yield();	//work가 false가 되면 다른 스레드에게 실행 양보
			}
		}
		System.out.println("ThreadC 종료");
	}
}
