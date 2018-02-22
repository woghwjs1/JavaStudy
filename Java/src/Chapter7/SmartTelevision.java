package Chapter7;

public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;
	
	//RemoteControl 추상메소드에 대한 실체메소드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 티비 볼륨 : " + volume);
	}
	
	//Searchable 추상메소드에 대한 실체메소드
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

}
