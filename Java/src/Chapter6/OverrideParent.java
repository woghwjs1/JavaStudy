package Chapter6;

public class OverrideParent {
	//부모클래스 
	
	double areaCircle(double r) {
		System.out.println("OverrideParent 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}
