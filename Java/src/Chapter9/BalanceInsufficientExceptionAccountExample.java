package Chapter9;

public class BalanceInsufficientExceptionAccountExample {
	//����� ���� ���� �߻� �����ϱ�
	public static void main(String[] args) {
		BalanceInsufficientExceptionAccount account = new BalanceInsufficientExceptionAccount();
		
		//�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ� : " + account.getBalance());
		
		//����ϱ�
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}

	}

}
