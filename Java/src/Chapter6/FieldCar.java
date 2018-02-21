package Chapter6;

public class FieldCar {
	//타이어를 부품으로 가지는 클래스
	
	//필드
	FieldTire frontLeftTire = new FieldTire("앞왼쪽", 6);
	FieldTire frontRightTire = new FieldTire("앞오른쪽", 2);
	FieldTire backLeftTire = new FieldTire("뒤왼쪽", 4);
	FieldTire backRightTire = new FieldTire("뒤오른쪽", 3);
	
	//생성자
	
	//메소드
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll() == false) {stop(); return 1;}
		if(frontRightTire.roll() == false) {stop(); return 2;}
		if(backLeftTire.roll() == false) {stop(); return 3;}
		if(backRightTire.roll() == false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
