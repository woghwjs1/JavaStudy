package Chapter7;

public class DriverExample {
	//매개 변수의 다형성 테스트
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.driver(bus);
		driver.driver(taxi);

	}

}
