package Chapter5;

public class StaticInitializeCare {
	//���� �޼ҵ�� ��� ���� �� ������ ��
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		StaticInitializeCare sta = new StaticInitializeCare();
		sta.speed = 60;
		sta.run();

	}

}
