package Chapter11;

public class ThreadF extends Thread{
	//WorkObject의 methodB를 실행하는 스레드
	private WorkObject workObject;
	
	public ThreadF(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();	//공유 객체의 methodB()를 10번 반복 호출
		}
	}
}