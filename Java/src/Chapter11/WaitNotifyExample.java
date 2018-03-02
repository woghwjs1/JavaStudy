package Chapter11;

public class WaitNotifyExample {
	//두 스레드를 생성하고 실행하는 메인 스레드
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();	//공유 객체 생성
		
		ThreadE threadE = new ThreadE(workObject);	//스레드 생성
		ThreadF threadF = new ThreadF(workObject);	//스레드 생성
		
		threadE.start();	//실행
		threadF.start();	//실행
		

	}

}
