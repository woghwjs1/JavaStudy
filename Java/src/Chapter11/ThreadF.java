package Chapter11;

public class ThreadF extends Thread{
	//WorkObject�� methodB�� �����ϴ� ������
	private WorkObject workObject;
	
	public ThreadF(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();	//���� ��ü�� methodB()�� 10�� �ݺ� ȣ��
		}
	}
}