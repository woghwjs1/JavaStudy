package Chapter16;

import java.io.InputStream;

public class SystemInExample2 {
	// �ֿܼ��� �Է��� �ѱ� �˾Ƴ���
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		
		byte[] datas = new byte[100];
		
		System.out.print("�̸� : ");
		int nameBytes = is.read(datas);
		String name = new String(datas, 0, nameBytes-2/*���� 2����Ʈ�� EnterŰ�� �ش��ϴ� ĳ���� ����(13)�� ���� �ǵ�(10)�̹Ƿ� ���ڿ����� ���ܽ�Ŵ */);
		
		System.out.print("�ϰ���� ��: ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-2/*���� 2����Ʈ�� EnterŰ�� �ش��ϴ� ĳ���� ����(13)�� ���� �ǵ�(10)�̹Ƿ� ���ڿ����� ���ܽ�Ŵ */);
		
		System.out.println("�Է��� �̸�: " + name);
		System.out.println("�Է��� �ϰ� ������: " + comment);

	}

}
