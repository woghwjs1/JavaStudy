package Chapter5;

public class Car3 {
	//�ν��Ͻ� �ɹ��� this
	
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
			System.out.println(this.model + " �޸��ϴ�. �ü� : " + this.speed);
		}
	}
}
