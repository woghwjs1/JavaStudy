package Chapter15;

import java.util.Arrays;

public class MatchExample {
	//��Ī
	public static void main(String[] args) {
		int[] intArr = {2, 3, 4};
		
		boolean result = Arrays.stream(intArr)
				.allMatch(a -> a%2==0);
		System.out.println("�ϳ��� 3�� ����� �ִ°�? " + result);
		
		result = Arrays.stream(intArr)
				.noneMatch(a -> a%3==0);
		System.out.println("3�� ����� ���°�?" + result);

	}

}
