package Chapter2;

public class InputDataCheckNaNExample1 {
	//"NaN" ���ڿ��� ������
	public static void main(String[] args) {
		String userInput = "NaN";	//����ڷκ��� �Է¹��� ��
		double val = Double.valueOf( userInput );	//�Է°��� double Ÿ������ ��ȯ
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
		

	}

}
