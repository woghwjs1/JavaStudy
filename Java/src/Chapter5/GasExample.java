package Chapter5;

public class GasExample {
	//return��
	public static void main(String[] args) {
		Gas gas = new Gas();
		
		gas.setGas(10);
		
		boolean gasState = gas.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			gas.run();
		}
		
		if(gas.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� �����ϼ���.");
		}

	}

}
