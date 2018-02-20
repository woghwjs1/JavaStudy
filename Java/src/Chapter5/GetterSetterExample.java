package Chapter5;

public class GetterSetterExample {
	//Getter와 Setter의 메소드 사용
	public static void main(String[] args) {
		GetterSetter GS = new GetterSetter();
		
		//잘못된 속도 변경
		GS.setSpeed(-50);
		System.out.println("잘못된 속도 변경(-50) : " + GS.getSpeed());
		
		//올바른 속도 변경
		GS.setSpeed(50);
		System.out.println("올바른 속도 변경( 50) : " + GS.getSpeed());
		
		//멈춤
		if(!GS.isStop()) {
			GS.setStop(true);
		}
		System.out.println("정지 후 속도 : " + GS.getSpeed());
	}

}
