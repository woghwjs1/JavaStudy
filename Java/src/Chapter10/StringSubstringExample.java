package Chapter10;

public class StringSubstringExample {
	//���ڿ� �����ϱ�
	public static void main(String[] args) {
		String ssn = "881015-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

	}

}
