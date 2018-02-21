package Chapter6;

public class OverrideExample {
	//메소드 오버라이딩 테스트
	public static void main(String[] args) {
		int r = 10;
		
		OverrideParent parent = new OverrideParent();
		OverrideChild child = new OverrideChild();
		
		System.out.println("parent 원면적 : " + parent.areaCircle(r));
		System.out.println();
		
		System.out.println("child 원면적 : " + child.areaCircle(r));
		System.out.println();
		

	}

}
