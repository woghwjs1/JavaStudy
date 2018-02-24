package Chapter9;

public class BalanceInsufficientExceptionAccount {
	//����� ���� ���� �߻���Ű��
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
			throw new BalanceInsufficientException("�ܰ����: " + (money-balance)+" ���ڶ�");
		}
		balance -= money;
	}
}
