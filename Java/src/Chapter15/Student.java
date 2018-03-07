package Chapter15;

public class Student implements Comparable<Student>{
	//학생 클래스
	public enum Sex {MALE, FEMALE}
	public enum City {Seoul, Busan}
	
	private String name;
	private int score;
	private Sex sex;
	private City city;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public Student(String name, int score, Sex sex, City city) {
		this.name = name;
		this.score = score;
		this.sex = sex;
		this.city = city;
	}
	
	public Student(String name, int score, Sex sex) {
		this.name = name;
		this.score = score;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	public Sex getSex() {
		return sex;
	}

	public City getCity() {
		return city;
	}

	//정렬 가능한 클래스
	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
	}
}
