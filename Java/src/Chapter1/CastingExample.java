package Chapter1;

public class CastingExample {
	//★강제 타입 변환
	public static void main(String[] args) {
	int intValue = 44032;
	char charValue = (char) intValue;
	System.out.println(charValue);
	
	long longValue = 200;
		 intValue = (int) longValue;
	System.out.println(intValue);
	
	double doubleValue = 3.14;
		 intValue = (int) doubleValue;
	System.out.println(intValue);

	}

}
