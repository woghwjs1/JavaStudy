package Chapter16;

import java.io.Console;

public class ConsoleExample {
	//���̵�� �н����带 �ַܼκ��� ����
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.print("���̵�: ");
		String id = console.readLine();
		
		System.out.print("�н�����: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);//char[] �迭�� ���ڿ��� ����
		
		System.out.println("--------------");
		System.out.println(id);				//id�� Password�� �ֿܼ� ���
		System.out.println(strPassword);	//id�� Password�� �ֿܼ� ���

	}

}
