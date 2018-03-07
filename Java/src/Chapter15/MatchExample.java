package Chapter15;

import java.util.Arrays;

public class MatchExample {
	//매칭
	public static void main(String[] args) {
		int[] intArr = {2, 3, 4};
		
		boolean result = Arrays.stream(intArr)
				.allMatch(a -> a%2==0);
		System.out.println("하나라도 3의 배수가 있는가? " + result);
		
		result = Arrays.stream(intArr)
				.noneMatch(a -> a%3==0);
		System.out.println("3의 배수가 없는가?" + result);

	}

}
