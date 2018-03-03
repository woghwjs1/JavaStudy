package Chapter12;

public class BoxingMethodExample {
	//제네릭 메소드 호출
	public static void main(String[] args) {
		BoxGeneric<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		BoxGeneric<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();

	}

}
