package Chapter13;

public class Student {
	//Student Å¬·¡½º
	private String name;
	private int englishScore;
	private int mathScore;
	
	public Student(String name, int englishScore, int mathScore) {
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		this.name = name;
	}
	
	public String getName() {return name;}
	public int getEnglishScore() {return englishScore;}
	public int getMathScore() {return mathScore;}
}
