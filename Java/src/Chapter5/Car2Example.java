package Chapter5;

public class Car2Example {

	public static void main(String[] args) {
		Car2 car = new Car2();
		car.keyTurnOn();
		car.run();
		int speed = car.getSpeed();
		
		System.out.println("현재속도 : " + speed);

	}

}
