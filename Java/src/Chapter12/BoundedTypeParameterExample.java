package Chapter12;

public class BoundedTypeParameterExample {
	//제네릭 메소드 호출
	public static void main(String[] args) {
		//String str = Util3.compare("a", "b"); //(X) String은 Number 타입이 아님
		
		int result1 = Util3.compare(10, 20);	//int -> Integer (자동 Boxing)
		System.out.println(result1);
		
		int result2 = Util3.compare(4.5, 3);	//double -> Double (자동 Boxing)
		System.out.println(result2);

	}

}
