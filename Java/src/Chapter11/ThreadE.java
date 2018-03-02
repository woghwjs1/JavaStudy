package Chapter11;

public class ThreadE extends Thread{
	//WorkObject�� methodA�� �����ϴ� ������
	private WorkObject workObject;
	
	public ThreadE(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();	//���� ��ü�� methodA()�� 10�� �ݺ� ȣ��
		}
	}
}
