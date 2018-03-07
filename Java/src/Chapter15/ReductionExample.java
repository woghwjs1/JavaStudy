package Chapter15;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	//reduce() �޼ҵ� �̿�
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 92),
				new Student("���ڹ�", 95),
				new Student("ȫ�β�", 88)
				);
		
		//sum() �̿�
		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore)
				.sum();
		
		//reduce(BinaryOperator<Inreger>accmulator) �̿�
		int sum2 = studentList.stream()
				.map(Student :: getScore)
				.reduce((a,  b) -> a+b)
				.get();
		
		//reduce(int identity.IntBinaryOperator op) �̿�
		int sum3 = studentList.stream()
				.map(Student :: getScore)
				.reduce(0, (a,  b) -> a+b);
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);

	}

}
