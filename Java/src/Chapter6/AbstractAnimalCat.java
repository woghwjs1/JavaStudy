package Chapter6;

public class AbstractAnimalCat extends AbstractAnimal{
	//�߻� �޼ҵ� �������̵�
	public AbstractAnimalCat() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {	//�߻� �޼ҵ� ������
		System.out.println("�߿�");
	}
	
}
