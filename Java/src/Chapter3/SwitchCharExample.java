package Chapter3;

public class SwitchCharExample {
	//char Ÿ���� switch��
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("���ȸ�� �Դϴ�.");
				break;
				
			case 'B':
			case 'b':
				System.out.println("�Ϲ�ȸ�� �Դϴ�.");
				break;
				
			default:
				System.out.println("�մ��Դϴ�.");
		}

	}

}
