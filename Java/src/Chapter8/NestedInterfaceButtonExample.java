package Chapter8;

public class NestedInterfaceButtonExample {
	//��ư �̺�Ʈ ó��
	public static void main(String[] args) {
		NestedInterfaceButton button = new NestedInterfaceButton();
		
		button.setOnClickListener(new NestedInterfaceCallListener());
		button.touch();
		
		button.setOnClickListener(new NestedInterfaceMessageListener());
		button.touch();

	}

}
