package Chapter11;

public class MainThreadExample {
	//���� �����尡 �����ϴ� �ڵ�
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();			//������ ����
		user1.setCalculator(calculator);	//���� ��ü ����
		user1.start();						//������ ����
		
		User2 user2 = new User2();			//������ ����
		user2.setCalculator(calculator);	//���� ��ü ����
		user2.start();						//������ ����

	}

}
