package Chapter10;

public class EqualsExample {
	//객체 동등 비교 ( equals() 메소드 )
	public static void main(String[] args) {
		Equals obj1 = new Equals("blue");
		Equals obj2 = new Equals("blue");
		Equals obj3 = new Equals("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등");
		}else {
			System.out.println("obj1과 obj2는 다름");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등");
		}else {
			System.out.println("obj1과 obj3는 다름");
		}
	}

}
