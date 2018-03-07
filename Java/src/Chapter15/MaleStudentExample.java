package Chapter15;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
	//���л��� MaleStudent�� ����
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("ȫ�浿", 10, Student.Sex.MALE),
				new Student("�ڼ���", 6, Student.Sex.FEMALE),
				new Student("ȫ�β�", 7, Student.Sex.MALE),
				new Student("�ڳ���", 10, Student.Sex.FEMALE)
				);
				
		MaleStudent maleStudent = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accmulate, MaleStudent :: combine);
		
		maleStudent.getList().stream()
		.forEach(s -> System.out.println(s.getName()));
	}

}
