package Chapter6;

public class OverrideChild extends OverrideParent{
	//자식클래스
	
	@Override
	double areaCircle(double r) {
		System.out.println("OverrideChild 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
