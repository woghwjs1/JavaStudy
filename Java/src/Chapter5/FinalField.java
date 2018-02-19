package Chapter5;

public class FinalField {
	//파이널 필드 선언과 초기화
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public FinalField(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
