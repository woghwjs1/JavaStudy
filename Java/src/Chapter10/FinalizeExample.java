package Chapter10;

public class FinalizeExample {
	//finalize() �޼ҵ��� ����
	public static void main(String[] args) {
		FinalizeCounter counter = null;
		for(int i=1; i<=50; i++) {
			counter = new FinalizeCounter(i);
			
			counter = null;	//Counter ��ü�� ������� ����
			
			System.gc();
		}

	}

}
