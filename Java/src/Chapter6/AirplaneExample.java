package Chapter6;

public class AirplaneExample {
	//super ����
	public static void main(String[] args) {
		AirplaneChild child = new AirplaneChild();
		
		child.land();
		child.fly();
		child.flyMode = child.SuperSonic;
		child.fly();
		child.flyMode = child.Normal;
		child.fly();
		child.takeoff();

	}

}
