package Chapter16;

import java.util.Scanner;

public class ScannerExample {
	//���ڿ�, ����, �Ǽ��� ���� �д� ����
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�> ");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		System.out.println();
		
		System.out.println("�Ǽ� �Է�> ");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);

	}

}
