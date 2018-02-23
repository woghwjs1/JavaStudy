package Chapter8;

public class AnonymousAAnonymous {
	//�͸� ���� Ŭ������ ��ü ����
	
	//�ʵ� �ʱⰪ���� ����
	AnonymousARemoteControl field = new AnonymousARemoteControl(){
		@Override
		public void turnOn() {
			System.out.println("������ �մϴ�.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("������ ���ϴ�.");
		}
	};
	
	void method1() {
		//���� ���������� ����
		AnonymousARemoteControl localVar = new AnonymousARemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�.");
			}
		};
		//���� ���� ���
		localVar.turnOn();
		localVar.turnOff();
	}
	
	void method2(AnonymousARemoteControl rc) {
		rc.turnOn();
	}
}
