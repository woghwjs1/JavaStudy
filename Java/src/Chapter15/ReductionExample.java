package Chapter15;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	//reduce() 메소드 이용
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 92),
				new Student("김자바", 95),
				new Student("홍두께", 88)
				);
		
		//sum() 이용
		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore)
				.sum();
		
		//reduce(BinaryOperator<Inreger>accmulator) 이용
		int sum2 = studentList.stream()
				.map(Student :: getScore)
				.reduce((a,  b) -> a+b)
				.get();
		
		//reduce(int identity.IntBinaryOperator op) 이용
		int sum3 = studentList.stream()
				.map(Student :: getScore)
				.reduce(0, (a,  b) -> a+b);
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);

	}

}
