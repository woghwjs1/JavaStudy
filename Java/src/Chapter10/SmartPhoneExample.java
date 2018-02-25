package Chapter10;

public class SmartPhoneExample {
	//객체의 문자 정보(toString() 메소드)
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String SPobj = myPhone.toString();
		
		System.out.println(SPobj);
		System.out.println(myPhone);

	}

}
