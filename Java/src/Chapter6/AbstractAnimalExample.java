package Chapter6;

public class AbstractAnimalExample {
	//실행 클래스
	public static void main(String[] args) {
		AbstractAnimalDog dog = new AbstractAnimalDog();
		AbstractAnimalCat cat = new AbstractAnimalCat();
		dog.sound();
		cat.sound();
		System.out.println("---------");
		
		//변수의 자동 타입 변환
		AbstractAnimal animal = null;
		animal = new AbstractAnimalDog();
		animal.sound();
		animal = new AbstractAnimalCat();
		animal.sound();
		System.out.println("---------");
		
		//메소드 다형성
		animalSound(new AbstractAnimalDog());
		animalSound(new AbstractAnimalCat());
		
	}
	public static void animalSound(AbstractAnimal animal) {
		animal.sound();
	}

}
