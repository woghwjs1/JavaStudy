package Chapter15;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
	//남학생을 MaleStudent에 누적
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("박수미", 6, Student.Sex.FEMALE),
				new Student("홍두께", 7, Student.Sex.MALE),
				new Student("박나래", 10, Student.Sex.FEMALE)
				);
				
		MaleStudent maleStudent = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accmulate, MaleStudent :: combine);
		
		maleStudent.getList().stream()
		.forEach(s -> System.out.println(s.getName()));
	}

}
