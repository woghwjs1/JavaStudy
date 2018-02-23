package Chapter8;

public class AnonymousBWindow {
	//UI Ŭ����
	NestedInterfaceButton button1 = new NestedInterfaceButton();
	NestedInterfaceButton button2 = new NestedInterfaceButton();
	
	//�ʵ� �ʱⰪ���� ����
	NestedInterfaceButton.OnClickListener listener = new NestedInterfaceButton.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	AnonymousBWindow(){
		button1.setOnClickListener(listener);	//�Ű������� �ʵ� ����
		button2.setOnClickListener(new NestedInterfaceButton.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�޼����� �����ϴ�.");
				
			}
		});
	}
}
