package Chapter8;

public class NestedInterfaceMessageListener implements NestedInterfaceButton.OnClickListener{
	//구현 클래스
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
}
