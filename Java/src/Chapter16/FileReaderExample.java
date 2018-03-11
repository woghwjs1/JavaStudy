package Chapter16;

import java.io.FileReader;

public class FileReaderExample {
	//텍스트 파일 읽기
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("C:/Java/Copy.txt");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=fr.read(cbuf))!= -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		fr.close();

	}

}
