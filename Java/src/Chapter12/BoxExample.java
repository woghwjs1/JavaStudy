package Chapter12;

public class BoxExample {
	//비제네릭 타입 이용
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동"); 					//String -> Object (자동 타입 변환)
		String name = (String) box.get();	//Object -> String (강제 타입 변환)
		
		box.set(new Apple());				//Apple -> Object (자동 타입 변환)
		Apple apple = (Apple) box.get();	//Object -> Apple (강제 타입 변환)

	}

}
