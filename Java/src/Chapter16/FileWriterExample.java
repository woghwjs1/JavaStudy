package Chapter16;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	//���ڿ��� ���Ͽ� ����
	public static void main(String[] args) throws Exception{
		File file = new File("C:/temp/file.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("FileWriter�� �ѱ۷ε� " + "\r\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�." + "\r\n");
		fw.flush();
		fw.close();
		
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");

	}

}
