package Chapter7;

public class RemoteControlExample {
	//�������̽� ���
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
		
	//���� �޼ҵ� ���
		RemoteControl.changeBattery();//���� �޼ҵ�� �ٷ� ȣ���� �����ϴ�.

	}

}
