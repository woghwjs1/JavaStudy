package Chapter11;

public class ThreadE extends Thread{
	//WorkObject의 methodA를 실행하는 스레드
	private WorkObject workObject;
	
	public ThreadE(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();	//공유 객체의 methodA()를 10번 반복 호출
		}
	}
}
