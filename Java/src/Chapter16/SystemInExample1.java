package Chapter16;

import java.io.InputStream;

public class SystemInExample1 {
	//�ֿܼ��� �Է��� ��ȣ �˾Ƴ���
	public static void main(String[] args) throws Exception{
		System.out.println("== �޴� ==");
		System.out.println("1. ���� ��ȸ");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �Ա�");
		System.out.println("4. ���� �ϱ�");
		System.out.println("�޴��� �����ϼ���: ");
		
		InputStream is = System.in;//Ű���� �Է� ��Ʈ�� ���
		char inputChar = (char) is.read();//�ƽ�Ű �ڵ带 �а� ���ڷ� ����
		switch(inputChar) {
		case '1':
			System.out.println("���� ��ȸ�� �����ϼ˽��ϴ�.");
			break;
		case '2':
			System.out.println("���� ����� �����ϼ˽��ϴ�.");
			break;
		case '3':
			System.out.println("���� �Ա��� �����ϼ˽��ϴ�.");
			break;
		case '4':
			System.out.println("���� �ϱ⸦ �����ϼ˽��ϴ�.");
			break;
		}
		

	}

}
