package Chapter2;

public class InputDataCheckNaNExample2 {
	//"NaN"�� üũ�ϰ� ���� ����
	public static void main(String[] args) {
		String userInput = "NaN";	//����ڷκ��� �Է¹��� ��
		double val = Double.valueOf( userInput );	//�Է°��� double Ÿ������ ��ȯ
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);

	}

}
