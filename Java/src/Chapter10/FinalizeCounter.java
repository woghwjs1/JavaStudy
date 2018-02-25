package Chapter10;

public class FinalizeCounter {
	//finalize() 메소드의 재정의
	private int no;
	
	public FinalizeCounter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}
}
