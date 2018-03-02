package Chapter11;

public class WorkObject {
	//두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 객체
	public synchronized void methodA() {
		System.out.println("ThreadE의 methodA() 작업 실행");
		notify();//일시 정지 상태에 있는 ThreadF를 실행 대기 상태로 만듬
		try {
			wait();	//ThreadE를 일시 정지 상태로 만듬
		} catch (Exception e) {	}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadF의 methodB() 작업 실행");
		notify();//일시 정지 상태에 있는 ThreadE를 실행 대기 상태로 만듬
		try {
			wait();	//ThreadF를 일시 정지 상태로 만듬
		} catch (Exception e) {	}
	}
	
}
