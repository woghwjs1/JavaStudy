package Chapter8;

public class AnonymousAAnonymous {
	//익명 구현 클래스와 객체 생성
	
	//필드 초기값으로 대입
	AnonymousARemoteControl field = new AnonymousARemoteControl(){
		@Override
		public void turnOn() {
			System.out.println("전원을 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("전원을 끕니다.");
		}
	};
	
	void method1() {
		//로컬 변수값으로 대입
		AnonymousARemoteControl localVar = new AnonymousARemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
		};
		//로컬 변수 사용
		localVar.turnOn();
		localVar.turnOff();
	}
	
	void method2(AnonymousARemoteControl rc) {
		rc.turnOn();
	}
}
