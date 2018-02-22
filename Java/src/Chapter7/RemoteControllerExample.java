package Chapter7;

public class RemoteControllerExample {
	//인터페이스 변수에 구현 객체 대입
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
	//익명 구현 클래스
		RemoteControl re = new RemoteControl() {
			public void turnOn() {/*실행문*/};
			public void turnOff() {/*실행문*/};
			public void setVolume(int volume) {/*실행문*/};
		};

	}

}
