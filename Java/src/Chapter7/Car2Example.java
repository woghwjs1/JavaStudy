package Chapter7;

public class Car2Example {
	//�ʵ� ������ �׽�Ʈ
	public static void main(String[] args) {
		Car2 car = new Car2();
		
		car.run();
		
		car.tires[0] = new KumhoTire();
		car.tires[1] = new KumhoTire();
		car.run();

	}

}
