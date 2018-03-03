package Chapter13;

public class MyFunctionalInterfaceExample3 {
	//람다식
	public static void main(String[] args) {
		MyFunctionalInterface3 fi;
		
		fi= (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;//실행문이 하나라면 {}생략 가능
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> sum(x, y);//실행문이 하나라면 {}생략 가능
		System.out.println(fi.method(2, 5));

	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}

}