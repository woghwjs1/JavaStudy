package Chapter11;

public class SumThread extends Thread{
	//1-100������ ���� ����ϴ� ������
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	public void run() {
		for(int i=1; i<=100; i++) {
			sum += i;
		}
	}
}
