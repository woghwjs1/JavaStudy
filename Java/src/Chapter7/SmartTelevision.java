package Chapter7;

public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;
	
	//RemoteControl �߻�޼ҵ忡 ���� ��ü�޼ҵ�
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("Tv�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� Ƽ�� ���� : " + volume);
	}
	
	//Searchable �߻�޼ҵ忡 ���� ��ü�޼ҵ�
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

}
