package Chapter16;

import java.io.FileInputStream;

public class FileInputStreamExample {
	// 텍스트 파일을 읽고 출력
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"C:/(읽을파일 위치와 파일 지정)"
					);
			int data;
			
			//1바이트씩 읽고 콘솔에 출력
			while((data = fis.read() ) != -1) {
				System.out.write(data);
			}
			
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
