package Chapter7;

public class RemoteControllerExample {
	//�������̽� ������ ���� ��ü ����
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
	//�͸� ���� Ŭ����
		RemoteControl re = new RemoteControl() {
			public void turnOn() {/*���๮*/};
			public void turnOff() {/*���๮*/};
			public void setVolume(int volume) {/*���๮*/};
		};

	}

}
