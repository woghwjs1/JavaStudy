package Chapter7;

public class CarExample {
	//�ʵ� ������ �׽�Ʈ
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.backRightTire = new KumhoTire();
		myCar.backLeftTire = new KumhoTire();
		
		myCar.run();

	}

}
