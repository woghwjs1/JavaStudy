package Chapter6;

public class ParameterDriverExample {
	//실행클래스
	public static void main(String[] args) {
		ParameterDriver driver = new ParameterDriver();
		
		ParameterBus bus = new ParameterBus();
		ParameterTaxi taxi = new ParameterTaxi();
		
		driver.driver(bus);
		driver.driver(taxi);
		
		
	}
}
