package Chapter6;

public class InheritanceChild extends InheritanceParent{
	//�ڽ� Ŭ����
	
	//�ʵ�
	public int childNo;
	
	public InheritanceChild(String name, String ssn, int childNo) {
		super(name, ssn);
		this.childNo = childNo;
		
	}
}
