package Chapter11;

public class ThreadA extends Thread{
	//ThreadA 클래스
	public ThreadA() {
		setName("ThreadA");	//스레드 이름 설정
	}
	
	public void run() {	//스레드A 실행 내용
		for(int i=0; i<2; i++) {
			System.out.println(getName()/*스레드 이름얻기*/ + "가 출력하는 내용");
		}
	}
}
