package Chapter8;

public class NestedInterfaceButton {
	//��ø �������̽�
	
	OnClickListener listener;	//�������̽� Ÿ�� �ʵ�
	
	//�Ű������� ������
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();	//���� ��ü�� onClick() �޼ҵ� ȣ��
	}
	
	//��ø �������̽�
	interface OnClickListener{
		void onClick();
	}
	
	
	
	
}
