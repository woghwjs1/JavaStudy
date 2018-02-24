package Chapter9;

public class BalanceInsufficientExceptionAccount {
	//사용자 정의 예외 발생시키기
	private long balance;
	
	public BalanceInsufficientExceptionAccount() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족: " + (money-balance)+" 모자람");
		}
		balance -= money;
	}
}
