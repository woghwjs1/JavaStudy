package Chapter6;

public class InheritanceChildExample {
	//자식클래스 사용
	public static void main(String[] args) {
		InheritanceChild child = new InheritanceChild("이홍기", "11111-11111", 1);
		
		System.out.println("child.name : " + child.name);
		System.out.println("child.ssn : " + child.ssn);
		System.out.println("child.childNo : " + child.childNo);

	}

}
