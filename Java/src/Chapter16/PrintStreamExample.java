package Chapter16;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	//���� ������ ����ϱ�
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/temp/file.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[������ ���� ��Ʈ��]");
		ps.print("��ġ ");
		ps.println("�����Ͱ� ����ϴ� ��ó�� ");
		ps.println("�����͸� ����մϴ�.");
		
		ps.flush();
		ps.close();
		fos.close();

	}

}
