package Chapter10;

public class SmartPhone {
	//��ü�� ���� ����(toString() �޼ҵ�)
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company + ", " + os;
	}
}
