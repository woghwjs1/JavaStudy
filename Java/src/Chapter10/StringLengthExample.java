package Chapter10;

public class StringLengthExample {
	//문자열의 문자 수 얻기
	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		}else {
			System.out.println("주민번호 자리수가 아닙니다.");
		}
	}

}
