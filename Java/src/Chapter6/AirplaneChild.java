package Chapter6;

public class AirplaneChild extends AirplaneParent{
	//super 변수
	public static final int Normal = 1;
	public static final int SuperSonic = 2;
	
	public int flyMode = 1;
	
	@Override
	public void fly() {
		if(flyMode == SuperSonic) {
		System.out.println("초음속 비행을 합니다");
		}else {
			super.fly();
		}
	}
}
