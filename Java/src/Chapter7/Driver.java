package Chapter7;

public class Driver {
	//매개 변수의 인터페이스화
	public void driver(Vehicle vehicle) {
		//객체 타입 확인
		if(vehicle instanceof Bus) {	//vehicle 매개 변수가 참조하는 객체가 Bus인지 조사
			Bus bus = (Bus) vehicle;	//Bus 객체일 경우 안전하게 강제 타입 변환시킴
			bus.checkFare();			//강제 변환하는 이유. 이 메소드를 호출하기 위해
		}
		
		vehicle.run();
	}
}
