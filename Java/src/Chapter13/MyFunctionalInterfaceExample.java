package Chapter13;

public class MyFunctionalInterfaceExample {
	//람다식
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi= () ->{
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call2"); };
		fi.method();
		
		fi = () -> System.out.println("method call3");//실행문이 하나라면 {}생략 가능
		fi.method();

	}

}
