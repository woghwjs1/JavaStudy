package Chapter13;

public class Student2 {
	//Student2 Å¬·¡½º
	private String name;
	private String sex;
	private int score;
	
	public Student2(String name, String sex, int score) {
		this.score = score;
		this.sex = sex;
		this.name = name;
	}
	
	public String getName() {return name;}
	public String getSex() {return sex;}
	public int getScore() {return score;}
}
