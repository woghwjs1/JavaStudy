package Chapter9;

public class BalanceInsufficientException extends Exception{
	//사용자 정의 예외 클래스 생성
	public BalanceInsufficientException() {	}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
