package Chapter6;

public class OverrideExample {
	//�޼ҵ� �������̵� �׽�Ʈ
	public static void main(String[] args) {
		int r = 10;
		
		OverrideParent parent = new OverrideParent();
		OverrideChild child = new OverrideChild();
		
		System.out.println("parent ������ : " + parent.areaCircle(r));
		System.out.println();
		
		System.out.println("child ������ : " + child.areaCircle(r));
		System.out.println();
		

	}

}
