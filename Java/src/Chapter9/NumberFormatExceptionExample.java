package Chapter9;

public class NumberFormatExceptionExample {
	//NumberFormatException이 발생하는 경우
	//문자열을 숫자로 변환할 때, 변환할 수 없는 문자가 껴있으면 발생한다.
	public static void main(String[] args) {
		String data1 = "1000";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		//int value2 = Integer.parseInt(data2);	//발생지점
		
		System.out.println(value1);
		//System.out.println(value2);	

	}

}
