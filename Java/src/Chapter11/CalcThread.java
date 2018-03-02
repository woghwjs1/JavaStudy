package Chapter11;

public class CalcThread extends Thread{
	//작업 스레드
	public CalcThread(String name) {
		setName(name);	//스레드 이름 변경
	}
	
	public void run() {	//스레드 실행 내용
		for(int i=0; i<20000000; i++) {	}
		System.out.println(getName());
	}
}
