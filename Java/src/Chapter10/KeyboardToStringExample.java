package Chapter10;

import java.io.IOException;

public class KeyboardToStringExample {
	//����Ʈ �迭�� ���ڿ��� ��ȯ
	public static void main(String[] args) throws IOException{
		byte[] bytes = new byte[100];	// ���� ����Ʈ�� �����ϱ� ���� �迭 ����
		
		System.out.println("�Է� : ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0 , readByteNo-2);
		System.out.println(str);
		
		

	}

}
