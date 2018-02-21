package Chapter6;

public class FieldCarExample {
	//실행 클래스
	public static void main(String[] args) {
		FieldCar car = new FieldCar();
		
		for(int i=1; i<=10; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("앞왼쪽 타이어를 한국타이어로 교체");
					car.frontLeftTire = new FieldHankookTire("앞왼쪽", 15);
					break;
				case 2:
					System.out.println("앞오른쪽 타이어를 금호타이어로 교체");
					car.frontRightTire = new FieldKumhoTire("앞오른쪽", 15);
					break;
				case 3:
					System.out.println("뒤왼쪽 타이어를 한국타이어로 교체");
					car.backLeftTire = new FieldHankookTire("뒤왼쪽", 15);
					break;
				case 4:
					System.out.println("뒤오른쪽 타이어를 금호타이어로 교체");
					car.backRightTire = new FieldKumhoTire("뒤오른쪽", 15);
					break;
			}
			System.out.println("--------------------");
		}
	}
}
