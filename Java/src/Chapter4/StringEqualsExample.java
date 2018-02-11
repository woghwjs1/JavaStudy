package Chapter4;

public class StringEqualsExample {
	//문자열 비교
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2의 참조는 동일.");
		}else {
			System.out.println("strVar1과 strVar2의 참조는 틀림.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2의 문자열 동일.");
		}
		
		System.out.println("--------------------------");
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4의 참조는 동일.");
		}else {
			System.out.println("strVar3과 strVar4의 참조는 틀림.");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4의 문자열 동일.");
		}

	}

}
