package Chapter6;

public abstract class AbstractAnimal {
	//추상 메소드 선언
	
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();	//추상메소드
}
