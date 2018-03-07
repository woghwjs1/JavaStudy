package Chapter15;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	//�ٸ� ��ҷ� ��ü
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("���ڹ�", 20),
				new Student("ȫ�β�", 30)				
				);
		
		studentList.stream()
		.mapToInt(Student :: getScore)
		.forEach(score -> System.out.println(score));

	}

}
