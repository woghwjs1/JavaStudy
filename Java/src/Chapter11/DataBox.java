package Chapter11;

public class DataBox {
	//�� �������� �۾� ������ ����ȭ �޼ҵ�� �ۼ��� ���� ��ü
	private String data;
	
	public synchronized String getData() {
		//data�ʵ尡 null�̸� �Һ��� �����带 �Ͻ����� ���·� ����
		if(this.data == null) {
			try {
				wait();
			} catch (Exception e) {	}
		}
		
		String returnValue = data;
		System.out.println("ConsummerThread�� ���� ������: " + returnValue);
		
		//data�ʵ带 null�� ����� ������ �����带 ���� �����·� ����
		data = null;
		notify();
		
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		//data �ʵ尡 null�� �ƴϸ� ������ �����带 �Ͻ� ���� ���·� ����
		if(this.data == null) {
			try {
				wait();
			} catch (Exception e) {	}
		}
		//data �ʵ忡 ���� �����ϰ� �Һ��� �����带 ���� ��� ���·� ����
		this.data = data;
		System.out.println("producerThread�� ������ ������: " + data);
		notify();
	}
}
