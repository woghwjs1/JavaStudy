package Chapter8;

public class AnonymousBWindow {
	//UI 클래스
	NestedInterfaceButton button1 = new NestedInterfaceButton();
	NestedInterfaceButton button2 = new NestedInterfaceButton();
	
	//필드 초기값으로 대입
	NestedInterfaceButton.OnClickListener listener = new NestedInterfaceButton.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	AnonymousBWindow(){
		button1.setOnClickListener(listener);	//매개값으로 필드 대입
		button2.setOnClickListener(new NestedInterfaceButton.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
				
			}
		});
	}
}
