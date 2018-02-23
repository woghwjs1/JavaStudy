package Chapter8;

public class NestedInterfaceButton {
	//중첩 인터페이스
	
	OnClickListener listener;	//인터페이스 타입 필드
	
	//매개변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();	//구현 객체의 onClick() 메소드 호출
	}
	
	//중첩 인터페이스
	interface OnClickListener{
		void onClick();
	}
	
	
	
	
}
