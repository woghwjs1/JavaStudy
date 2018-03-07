package Chapter16;

import java.util.Scanner;

public class ScannerExample {
	//문자열, 정수, 실수를 직접 읽는 예제
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 입력> ");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		System.out.println();
		
		System.out.println("실수 입력> ");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);

	}

}
