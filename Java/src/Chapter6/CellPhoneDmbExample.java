package Chapter6;

public class CellPhoneDmbExample {
	//자식 클래스 사용
	public static void main(String[] args) {
		//CellPhoneDmb 객체 생성
		CellPhoneDmb dmb = new CellPhoneDmb("자바폰", "검정", 10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);
		
		//CellPhoneDmb의 필드
		System.out.println("채널 : " + dmb.channel);
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("누구세요?");
		dmb.receiveVoice("접니다.");
		dmb.hangUp();
		dmb.powerOff();
		
		//CellPhoneDmb의 메소드 호출
		dmb.turnOnDmb();
		dmb.changeChannelDmb(19);
		dmb.turnOffDmb();
		

	}

}
