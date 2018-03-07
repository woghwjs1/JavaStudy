package Chapter15;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	//성별로 그룹핑하기
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("박수미", 6, Student.Sex.FEMALE),
				new Student("홍두께", 7, Student.Sex.MALE),
				new Student("박나래", 10, Student.Sex.FEMALE)
				);
		
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getSex));
		
		System.out.println("[남학생]");
		mapBySex.get(Student.Sex.MALE).stream()
		.forEach(s->System.out.println(s.getName() + " "));
		
		System.out.println("\n[여학생]");
		mapBySex.get(Student.Sex.FEMALE).stream()
		.forEach(s->System.out.println(s.getName() + " "));
		
		System.out.println();
		
		Map<Student.City, List<String>> mapByCity = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student :: getCity,
								Collectors.mapping(Student::getName, Collectors.toList())
								)
						);
		
		System.out.println("\n[서울]");
		mapByCity.get(Student.City.Seoul).stream().forEach(s->System.out.print(s+" "));
		
		System.out.println("\n[부산]");
		mapByCity.get(Student.City.Busan).stream().forEach(s->System.out.print(s+" "));

	}

}
