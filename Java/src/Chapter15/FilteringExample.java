package Chapter15;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	//필터링
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "홍두께", "박나래", "김나라", "장나라");
		
		names.stream()
		.distinct()//중복 제거
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
		.filter(n -> n.startsWith("홍"))//필터링
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		//중복 제거 후 필터링
		names.stream()
		.distinct()
		.filter(n -> n.startsWith("홍"))
		.forEach(n -> System.out.println(n));
		System.out.println();

	}

}
