package Chapter6;

public class FieldCar2 {
	//간략화
	FieldTire[] tires = {
			new FieldTire("앞왼쪽", 6),
			new FieldTire("앞오른쪽", 2),
			new FieldTire("뒤왼쪽", 3),
			new FieldTire("뒤오른쪽", 4)
	};
	
	int run() {
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll() == false) {stop(); return i+1;}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("차를 멈춥니다.");
	}
}
