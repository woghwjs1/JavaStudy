package Chapter7;

public class VehicleExample {
	//강제 타입 변환
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); //Vehicle 인터페이스에는 이 메소드가 없음
		
		Bus bus = (Bus) vehicle;	//강제 타입 변환
		bus.run();
		bus.checkFare();	//Bus클래스에는 이 메소드가 있슴

	}

}
