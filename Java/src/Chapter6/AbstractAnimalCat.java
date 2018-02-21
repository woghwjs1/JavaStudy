package Chapter6;

public class AbstractAnimalCat extends AbstractAnimal{
	//추상 메소드 오버라이딩
	public AbstractAnimalCat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {	//추상 메소드 재정의
		System.out.println("야옹");
	}
	
}
