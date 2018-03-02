package Chapter11;

public class Calculator {
	//공유 객체
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized/*동기화 메소드로 수정된 공유객체*/ void setMemory(int memory) {	//계산기 메모리에 값을 저장하는 메소드
		this.memory = memory;			//매개값을 memory 필드에 저장
		try {
			Thread.sleep(2000);			//스레드를 2초간 정지시킴
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName()/*스레드이름*/ + " : " + this.memory/*메모리값*/);
		}
	}
}
