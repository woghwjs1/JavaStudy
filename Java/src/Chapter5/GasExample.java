package Chapter5;

public class GasExample {
	//return문
	public static void main(String[] args) {
		Gas gas = new Gas();
		
		gas.setGas(10);
		
		boolean gasState = gas.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			gas.run();
		}
		
		if(gas.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}

	}

}
