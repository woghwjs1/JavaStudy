package Chapter10;

public class EqualsExample {
	//��ü ���� �� ( equals() �޼ҵ� )
	public static void main(String[] args) {
		Equals obj1 = new Equals("blue");
		Equals obj2 = new Equals("blue");
		Equals obj3 = new Equals("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� ����");
		}else {
			System.out.println("obj1�� obj2�� �ٸ�");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� ����");
		}else {
			System.out.println("obj1�� obj3�� �ٸ�");
		}
	}

}
