package Chapter10;

public class StringGetBytesExample {
	//바이트 배열로 변환
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		//기본 문자셋으로 인코딩과 디코딩
		byte[] byte1 = str.getBytes();
		System.out.println("byte1.length: " + byte1.length);
		String str1 = new String(byte1);
		System.out.println("byte1 -> String: " + str1);
		
		try {
			
			//EUC-KR을 이용해서 인코딩 및 디코딩
			byte[] byte2 = str.getBytes("EUC-KR");
			System.out.println("byte2.length: " + byte2.length);
			String str2 = new String(byte2, "EUC-KR");
			System.out.println("byte2 -> String: " + str2);
			
			//UTF-8을 이용해서 인코딩 및 디코딩
			byte[] byte3 = str.getBytes("UTF-8");
			System.out.println("byte3.length: " + byte3.length);
			String str3 = new String(byte3, "UTF-8");
			System.out.println("byte2 -> String: " + str3);
			
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
