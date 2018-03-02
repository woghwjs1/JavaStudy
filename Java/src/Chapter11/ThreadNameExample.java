package Chapter11;

public class ThreadNameExample {
	//메인 스레드 이름 출력 및 UserThread 생성 및 시작
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();	//이 코드를 실행하는 스레드 객체 얻기
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();	//스레드 생성
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();	//스레드A 시작
		
		ThreadB threadB = new ThreadB();	//스레드 생성
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();	//스레드B 시작

	}

}
