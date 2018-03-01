package Chapter10;

public class StringGetBytesExample {
	//����Ʈ �迭�� ��ȯ
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";
		
		//�⺻ ���ڼ����� ���ڵ��� ���ڵ�
		byte[] byte1 = str.getBytes();
		System.out.println("byte1.length: " + byte1.length);
		String str1 = new String(byte1);
		System.out.println("byte1 -> String: " + str1);
		
		try {
			
			//EUC-KR�� �̿��ؼ� ���ڵ� �� ���ڵ�
			byte[] byte2 = str.getBytes("EUC-KR");
			System.out.println("byte2.length: " + byte2.length);
			String str2 = new String(byte2, "EUC-KR");
			System.out.println("byte2 -> String: " + str2);
			
			//UTF-8�� �̿��ؼ� ���ڵ� �� ���ڵ�
			byte[] byte3 = str.getBytes("UTF-8");
			System.out.println("byte3.length: " + byte3.length);
			String str3 = new String(byte3, "UTF-8");
			System.out.println("byte2 -> String: " + str3);
			
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
