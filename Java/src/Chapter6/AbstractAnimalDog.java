package Chapter6;

public class AbstractAnimalDog extends AbstractAnimal{
	//�߻� �޼ҵ� �������̵�
	public AbstractAnimalDog() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {	//�߻� �޼ҵ� ������
		System.out.println("�۸�");
	}
	
}
