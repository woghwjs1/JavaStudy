package Chapter6;

public class AbstractPhoneExample {
	//추상 클래스
	public static void main(String[] args) {
		//AbstractPhone phone = new AbstractPhone();
		
		AbstractSmartPhone smartPhone = new AbstractSmartPhone("이민");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
