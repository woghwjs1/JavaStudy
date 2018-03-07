package Chapter15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
	//����
	public static void main(String[] args) {
		//���� ����� ���
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream
		.sorted()//���ڸ� ������������ ����
		.forEach(n -> System.out.println(n + ","));
		System.out.println();
		
		//��ü ����� ���
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("���ڹ�", 20),
				new Student("ȫ�β�", 30)				
				);
		
		studentList.stream()
		.sorted()//������ �������� ������������ Student ����
		.forEach(s -> System.out.println(s.getScore() + ","));
		System.out.println();
		
		studentList.stream()
		.sorted(Comparator.reverseOrder())//������ �������� ������������  Student ����
		.forEach(s -> System.out.print(s.getScore() + ","));
	}

}
