package Chapter6;

public class AirplaneChild extends AirplaneParent{
	//super ����
	public static final int Normal = 1;
	public static final int SuperSonic = 2;
	
	public int flyMode = 1;
	
	@Override
	public void fly() {
		if(flyMode == SuperSonic) {
		System.out.println("������ ������ �մϴ�");
		}else {
			super.fly();
		}
	}
}
