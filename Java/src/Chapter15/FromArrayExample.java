package Chapter15;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	// �迭�κ��� ��Ʈ�� ���
	public static void main(String[] args) {
		String[] strArray = {"ȫ�浿", "���ڹ�", "ȫ�β�"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a -> System.out.println(a + ","));
		System.out.println();
		
		int[] intArray = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(a -> System.out.println(a + ","));
		System.out.println();

	}

}
