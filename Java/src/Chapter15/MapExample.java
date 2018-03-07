package Chapter15;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	//다른 요소로 대체
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("김자바", 20),
				new Student("홍두께", 30)				
				);
		
		studentList.stream()
		.mapToInt(Student :: getScore)
		.forEach(score -> System.out.println(score));

	}

}
