package Chapter6;

public class AbstractAnimalDog extends AbstractAnimal{
	//추상 메소드 오버라이딩
	public AbstractAnimalDog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {	//추상 메소드 재정의
		System.out.println("멍멍");
	}
	
}
