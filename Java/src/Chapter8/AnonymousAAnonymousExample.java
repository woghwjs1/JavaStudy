package Chapter8;

public class AnonymousAAnonymousExample {
	//익명 구현 클래스와 객체 생성
	public static void main(String[] args) {
		AnonymousAAnonymous anony = new AnonymousAAnonymous();
		
		anony.field.turnOn();
		
		anony.method1();
		
		anony.method2(
				new AnonymousARemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("비디오 재생합니다.");
					}
					
					@Override
					public void turnOff() {
						System.out.println("비디오 정지합니다.");
					}
				}
				);

	}

}
