package Chapter6;

public class PromotionChildExample {
	//자동 타입 변환 후의 맴버 접근
	public static void main(String[] args) {
		PromotionChild child = new PromotionChild();
		
		PromotionParent parent = child;	//자동 타입 변환
		
		parent.method1();	
		parent.method2();	//재정의된 메소드가 호출됨
		//parent.method3();	//호출 불가능
	}
}
