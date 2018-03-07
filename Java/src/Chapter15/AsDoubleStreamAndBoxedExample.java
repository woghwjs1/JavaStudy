package Chapter15;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {
	//�ٸ� ��ҷ� ��ü
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream
		.asDoubleStream()//DoubleStream ����
		.forEach(d -> System.out.println(d));
		
		System.out.println();
		
		intStream = Arrays.stream(intArray);
		intStream
		.boxed()//Stream<Integer> ����
		.forEach(obj -> System.out.println(obj.intValue()));

	}

}
