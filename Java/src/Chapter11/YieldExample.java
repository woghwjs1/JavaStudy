package Chapter11;

public class YieldExample {
	//스레드 실행 양보 예제
	public static void main(String[] args) {
		ThreadC threadC = new ThreadC();
		ThreadD threadD = new ThreadD();
		threadC.start();
		threadD.start();
		
		try { Thread.sleep(3000);/*3초간 정지*/} catch (Exception e) {	}
		threadC.work = false;	//스레드C만 실행
		
		try { Thread.sleep(3000);/*3초간 정지*/} catch (Exception e) {	}
		threadC.work = true;	//스레드C,D 둘다 실행
		
		try { Thread.sleep(3000);/*3초간 정지*/} catch (Exception e) {	}
		threadC.stop = true;	//스레드C,D 둘다 정지
		threadD.stop = true;

	}

}
