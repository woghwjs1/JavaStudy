package Chapter10;

public class SmartPhoneExample {
	//��ü�� ���� ����(toString() �޼ҵ�)
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String SPobj = myPhone.toString();
		
		System.out.println(SPobj);
		System.out.println(myPhone);

	}

}
