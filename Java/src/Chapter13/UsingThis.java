package Chapter13;

public class UsingThis {
	//this ���
	public int outterField = 10;
	
	class Inner{
		int innerField = 20;
		
		void method() {
			//���ٽ�
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField: " + outterField);
				//�ٱ� ��ü�� ������ ��� ���ؼ��� Ŭ������.this�� ���
				System.out.println("outterField: " + UsingThis.this.outterField + "\n");
				
				System.out.println("innerField: " + innerField);
				//���ٽ� ���ο��� this�� inner ��ü�� ����
				System.out.println("innerField: " + this.innerField + "\n");
			};
			fi.method();
		}
	}
}
