package Chapter8;

public class AnonymousChildExample {
	//�͸� �ڽ� ��ü ����
	public static void main(String[] args) {
		AnonymousChild anony = new AnonymousChild();
		//�͸� ��ü �ʵ� ���
		anony.field.wake();
		
		//�͸� ��ü ���� ���� ���
		anony.method1();
		
		//�͸� ��ü �Ű��� ���
		anony.method2(
				new AnonymousPerson() {
					void study() {
						System.out.println("�����մϴ�.");
					}
					
					@Override
					void wake() {
						System.out.println("8�ÿ� �Ͼ�ϴ�");
						study();
					}
				}
				);
		

	}

}
