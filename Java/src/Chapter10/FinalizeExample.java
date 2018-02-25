package Chapter10;

public class FinalizeExample {
	//finalize() 메소드의 실행
	public static void main(String[] args) {
		FinalizeCounter counter = null;
		for(int i=1; i<=50; i++) {
			counter = new FinalizeCounter(i);
			
			counter = null;	//Counter 객체를 쓰레기로 만듬
			
			System.gc();
		}

	}

}
