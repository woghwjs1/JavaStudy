package Chapter5;

public class StaticInitialize {
	//정적 초기화 블럭
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}
