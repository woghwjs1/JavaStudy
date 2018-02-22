package Chapter7;

public class CarExample {
	//필드 다형성 테스트
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.backRightTire = new KumhoTire();
		myCar.backLeftTire = new KumhoTire();
		
		myCar.run();

	}

}
