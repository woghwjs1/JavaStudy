package Chapter15;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	//������ �׷����ϱ�
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("ȫ�浿", 10, Student.Sex.MALE),
				new Student("�ڼ���", 6, Student.Sex.FEMALE),
				new Student("ȫ�β�", 7, Student.Sex.MALE),
				new Student("�ڳ���", 10, Student.Sex.FEMALE)
				);
		
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getSex));
		
		System.out.println("[���л�]");
		mapBySex.get(Student.Sex.MALE).stream()
		.forEach(s->System.out.println(s.getName() + " "));
		
		System.out.println("\n[���л�]");
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
		
		System.out.println("\n[����]");
		mapByCity.get(Student.City.Seoul).stream().forEach(s->System.out.print(s+" "));
		
		System.out.println("\n[�λ�]");
		mapByCity.get(Student.City.Busan).stream().forEach(s->System.out.print(s+" "));

	}

}
