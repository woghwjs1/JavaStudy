package Chapter10;

public class StringToLowerUpperCaseExample {
	//전부 소문자 또는 대문자로 변경
	public static void main(String[] args) {
		String str1 = "java Programming";
		String str2 = "Java Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
