package Chapter12;

import java.util.Arrays;

public class WildCardExample {
	//와일드카드 타입 매개 변수
	public static void registerCourse( Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + 
						   Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent( Course<? /*학생과정*/extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + 
						   Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker( Course<? /*직장인과 일반인과정*/super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + 
						   Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
		personCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생 과정", 5);
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생 과정", 5);
		personCourse.add(new HighStudent("고등학생"));		
		
		//모든과정 등록 가능
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		//registerCourseStudent(personCourse);	//(X) 학생과정만 등록가능
		//registerCourseStudent(workerCourse);	//(X) 학생과정만 등록가능
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseWorker(studentCourse);		//(X) 직장인과 일반인만 등록가능
		//registerCourseWorker(highStudentCourse);	//(X) 직장인과 일반인만 등록가능
	}
}

class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
}

class Worker{
	String name;
	public Worker(String name) {
		this.name = name;
	}
}

class Student{
	String name;
	public Student(String name) {
		this.name = name;
	}
}

class HighStudent{
	String name;
	public HighStudent(String name) {
		this.name = name;
	}
}
