package Chapter10;

public class StringSplitExample {
	//문자열 분리
	public static void main(String[] args) {
		String text = "홍길동&이수홍, 박연수, 김자바-최명호";
		
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}

	}

}
