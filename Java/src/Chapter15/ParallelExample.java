package Chapter15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
	//���� ó��
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"ȫ�浿", "�ſ��", "���ڹ�", "ȫ�β�", "���ٽ�"				
				);
		
		//���� ó��
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print/*�޼ҵ� ����(s->ParallelExample.print(s)�� ����*/);
		System.out.println();
		
		//���� ó��
		Stream<String> ParallelStream = list.parallelStream();
		ParallelStream.forEach(ParallelExample :: print/*�޼ҵ� ����*/);

	}
	
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}

}
