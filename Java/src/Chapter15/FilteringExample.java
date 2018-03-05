package Chapter15;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	//���͸�
	public static void main(String[] args) {
		List<String> names = Arrays.asList("ȫ�浿", "ȫ�β�", "�ڳ���", "�質��", "�峪��");
		
		names.stream()
		.distinct()//�ߺ� ����
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
		.filter(n -> n.startsWith("ȫ"))//���͸�
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		//�ߺ� ���� �� ���͸�
		names.stream()
		.distinct()
		.filter(n -> n.startsWith("ȫ"))
		.forEach(n -> System.out.println(n));
		System.out.println();

	}

}
