package Chapter8;

public class AnonymousAAnonymousExample {
	//�͸� ���� Ŭ������ ��ü ����
	public static void main(String[] args) {
		AnonymousAAnonymous anony = new AnonymousAAnonymous();
		
		anony.field.turnOn();
		
		anony.method1();
		
		anony.method2(
				new AnonymousARemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("���� ����մϴ�.");
					}
					
					@Override
					public void turnOff() {
						System.out.println("���� �����մϴ�.");
					}
				}
				);

	}

}
