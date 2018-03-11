package Chapter16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	//파일 복사
	public static void main(String[] args) throws Exception{
		String originalFileName = "C:/Java/Copy.txt";
		String targetFileName = "C:/temp/Copy.txt";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes))!= -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fos.close();
		
		System.out.println("복사가 잘 되었습니다.");

	}

}
