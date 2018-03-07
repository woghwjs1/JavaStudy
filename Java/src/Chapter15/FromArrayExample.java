package Chapter15;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	// 배열로부터 스트림 얻기
	public static void main(String[] args) {
		String[] strArray = {"홍길동", "김자바", "홍두께"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a -> System.out.println(a + ","));
		System.out.println();
		
		int[] intArray = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(a -> System.out.println(a + ","));
		System.out.println();

	}

}
