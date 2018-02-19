package Chapter5;

public class Car2 {
	//클래스 외부에서 메소드 호출
	
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다. 현재속도 : " + speed);
		}
	}
	
}
