package Chapter12;

import java.util.Arrays;

public class WildCardExample {
	//���ϵ�ī�� Ÿ�� �Ű� ����
	public static void registerCourse( Course<?> course) {
		System.out.println(course.getName() + " ������: " + 
						   Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent( Course<? /*�л�����*/extends Student> course) {
		System.out.println(course.getName() + " ������: " + 
						   Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker( Course<? /*�����ΰ� �Ϲ��ΰ���*/super Worker> course) {
		System.out.println(course.getName() + " ������: " + 
						   Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��� ����", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		Course<Worker> workerCourse = new Course<Worker>("������ ����", 5);
		personCourse.add(new Worker("������"));
		
		Course<Student> studentCourse = new Course<Student>("�л� ����", 5);
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("����л� ����", 5);
		personCourse.add(new HighStudent("����л�"));		
		
		//������ ��� ����
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		//registerCourseStudent(personCourse);	//(X) �л������� ��ϰ���
		//registerCourseStudent(workerCourse);	//(X) �л������� ��ϰ���
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseWorker(studentCourse);		//(X) �����ΰ� �Ϲ��θ� ��ϰ���
		//registerCourseWorker(highStudentCourse);	//(X) �����ΰ� �Ϲ��θ� ��ϰ���
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
