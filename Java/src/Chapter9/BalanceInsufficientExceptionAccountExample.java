package Chapter9;

public class BalanceInsufficientExceptionAccountExample {
	//사용자 정의 예외 발생 실행하기
	public static void main(String[] args) {
		BalanceInsufficientExceptionAccount account = new BalanceInsufficientExceptionAccount();
		
		//예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		//출금하기
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
