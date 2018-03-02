package Chapter11;

public class User2 extends Thread{
	//User2 ½º·¹µå
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}