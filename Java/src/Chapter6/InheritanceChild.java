package Chapter6;

public class InheritanceChild extends InheritanceParent{
	//자식 클래스
	
	//필드
	public int childNo;
	
	public InheritanceChild(String name, String ssn, int childNo) {
		super(name, ssn);
		this.childNo = childNo;
		
	}
}
