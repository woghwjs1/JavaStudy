package Chapter6;

public class AbstractPhoneExample {
	//�߻� Ŭ����
	public static void main(String[] args) {
		//AbstractPhone phone = new AbstractPhone();
		
		AbstractSmartPhone smartPhone = new AbstractSmartPhone("�̹�");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
