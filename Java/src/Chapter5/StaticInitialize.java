package Chapter5;

public class StaticInitialize {
	//���� �ʱ�ȭ ��
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}
