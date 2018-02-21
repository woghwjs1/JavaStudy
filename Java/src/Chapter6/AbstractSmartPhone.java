package Chapter6;

public class AbstractSmartPhone extends AbstractPhone{
	//실체 클래스
	
	//생성자
	public AbstractSmartPhone(String owner) {
		super(owner);
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷을 검색합니다.");
	}

}
