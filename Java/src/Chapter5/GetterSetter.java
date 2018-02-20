package Chapter5;

public class GetterSetter {
	//Getter와 Setter 메소드 선언
	
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	
	//메소드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
