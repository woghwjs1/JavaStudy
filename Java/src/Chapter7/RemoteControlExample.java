package Chapter7;

public class RemoteControlExample {
	//인터페이스 사용
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
	//정적 메소드 사용
		RemoteControl.changeBattery();//정적 메소드는 바로 호출이 가능하다.

	}

}
