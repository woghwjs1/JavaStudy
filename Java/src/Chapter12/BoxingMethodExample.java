package Chapter12;

public class BoxingMethodExample {
	//���׸� �޼ҵ� ȣ��
	public static void main(String[] args) {
		BoxGeneric<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		BoxGeneric<String> box2 = Util.boxing("ȫ�浿");
		String strValue = box2.get();

	}

}
