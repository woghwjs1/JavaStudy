package Chapter5;

public class Car3 {
	//인스턴스 맴버와 this
	
	String model;
	int speed;
	
	Car3(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + " 달립니다. 시속 : " + this.speed);
		}
	}
}
