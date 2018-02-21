package Chapter6;

public class AbstractAnimalExample {
	//���� Ŭ����
	public static void main(String[] args) {
		AbstractAnimalDog dog = new AbstractAnimalDog();
		AbstractAnimalCat cat = new AbstractAnimalCat();
		dog.sound();
		cat.sound();
		System.out.println("---------");
		
		//������ �ڵ� Ÿ�� ��ȯ
		AbstractAnimal animal = null;
		animal = new AbstractAnimalDog();
		animal.sound();
		animal = new AbstractAnimalCat();
		animal.sound();
		System.out.println("---------");
		
		//�޼ҵ� ������
		animalSound(new AbstractAnimalDog());
		animalSound(new AbstractAnimalCat());
		
	}
	public static void animalSound(AbstractAnimal animal) {
		animal.sound();
	}

}
