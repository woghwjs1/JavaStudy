package Chapter6;

public abstract class AbstractPhone {
	// 추상 클래스
	
	//필드
	public String owner;
	
	//생성자
	public AbstractPhone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
