package Chapter11;

public class MainThreadExample {
	//메인 스레드가 실행하는 코드
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();			//스레드 생성
		user1.setCalculator(calculator);	//공유 객체 설정
		user1.start();						//스레드 시작
		
		User2 user2 = new User2();			//스레드 생성
		user2.setCalculator(calculator);	//공유 객체 설정
		user2.start();						//스레드 시작

	}

}
