package Chapter4;

public class StringEqualsExample {
	//���ڿ� ��
	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����.");
		}else {
			System.out.println("strVar1�� strVar2�� ������ Ʋ��.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ� ����.");
		}
		
		System.out.println("--------------------------");
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����.");
		}else {
			System.out.println("strVar3�� strVar4�� ������ Ʋ��.");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ� ����.");
		}

	}

}
