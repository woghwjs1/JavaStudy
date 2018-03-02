package Chapter11;

public class ProducerThread extends Thread{
	//데이터를 생산(저장)하는 스레드
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;	//공유 객체 필드에 저장
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			String data = "Data-" + i;
			dataBox.setData(data);//새로운 데이터를 저장
		}
	}
}
