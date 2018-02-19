package Chapter5;

public class CalculatorExample {
	//메소드 호출
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println(result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);
		
		myCalc.powerOff();
		

	}
	
	

}
