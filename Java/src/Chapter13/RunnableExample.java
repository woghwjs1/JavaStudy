package Chapter13;

public class RunnableExample {
	//함수적 인터페이스와 람다식
	public static void main(String[] args) {
		Runnable runnable = () ->{
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
