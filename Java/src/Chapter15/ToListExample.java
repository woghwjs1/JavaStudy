package Chapter15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	//필터링해서 새로운 컬렉션 생성
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("박수미", 6, Student.Sex.FEMALE),
				new Student("홍두께", 7, Student.Sex.MALE),
				new Student("박나래", 10, Student.Sex.FEMALE)
				);
		
		//남학생들만 묶어 List 생성
		List<Student> maleList = totalList.stream()
				.filter(s -> s.getSex()==Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream()
		.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		//여학생들만 묶어 HashSet 생성
		Set<Student> femaleSet = totalList.stream()
				.filter(s -> s.getSex()==Student.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet :: new));
		femaleSet.stream()
		.forEach(s -> System.out.println(s.getName()));

	}

}
