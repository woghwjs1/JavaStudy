package Chapter13;

import java.util.function.IntSupplier;

public class SupplierExample {
	//Supplier �Լ��� �������̽�
	public static void main(String[] args) {
		//���ٽ�
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random()*6) +1;
			return num;
		};
		
		
		int num = intSupplier.getAsInt();
		System.out.println("���� ��: " + num);

	}

}
