package Chapter15;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {
	//�׷��� �� ������
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("ȫ�浿", 10, Student.Sex.MALE),
				new Student("�ڼ���", 6, Student.Sex.FEMALE),
				new Student("ȫ�β�", 7, Student.Sex.MALE),
				new Student("�ڳ���", 10, Student.Sex.FEMALE)
				);
		
		//������ ��� ������ �����ϴ� Map ���
		Map<Student.Sex, Double> mapBySex = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student :: getSex,
								Collectors.averagingDouble(Student :: getScore)
								)
						);
		
		System.out.println("���л� ��� ����: " + mapBySex.get(Student.Sex.MALE));
		System.out.println("���л� ��� ����: " + mapBySex.get(Student.Sex.FEMALE));
		
		//������ ��ǥ�� ������ �̸��� �����ϴ� Map ���
		Map<Student.Sex, String> mapByName = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student :: getSex,
								Collectors.mapping(Student::getName, Collectors.joining(","))
								)
						);
		
		System.out.println("���л� ��ü �̸�: " + mapByName.get(Student.Sex.MALE));
		System.out.println("���л� ��ü �̸�: " + mapByName.get(Student.Sex.FEMALE));

	}

}
