package Chapter11;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("�۾� ������ ������.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {break;}
			save();
		}
	}
}
