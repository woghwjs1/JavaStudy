package Chapter10;

public class StringSubstringExample {
	//문자열 추출하기
	public static void main(String[] args) {
		String ssn = "881015-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

	}

}
