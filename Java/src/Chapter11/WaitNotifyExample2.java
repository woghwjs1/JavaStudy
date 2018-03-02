package Chapter11;

public class WaitNotifyExample2 {
	//두 스레드를 생성하고 실행하는 메인 스레드
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();

	}

}
