package Chapter10;

public class FinalizeCounter {
	//finalize() �޼ҵ��� ������
	private int no;
	
	public FinalizeCounter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no + "�� ��ü�� finalize()�� �����");
	}
}
