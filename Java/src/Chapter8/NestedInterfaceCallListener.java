package Chapter8;

public class NestedInterfaceCallListener implements NestedInterfaceButton.OnClickListener{
	//구현 클래스
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}
