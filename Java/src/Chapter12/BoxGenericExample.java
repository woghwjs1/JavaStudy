package Chapter12;

public class BoxGenericExample {
	//���׸� Ÿ�� �̿�
	public static void main(String[] args) {
		BoxGeneric<String> box1 = new BoxGeneric<String>();
		box1.set("hello");
		String str = box1.get();
		
		BoxGeneric<Integer> box2 = new BoxGeneric<Integer>();
		box2.set(6);
		int value = box2.get();

	}

}
