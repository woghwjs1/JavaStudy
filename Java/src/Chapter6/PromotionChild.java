package Chapter6;

public class PromotionChild extends PromotionParent{
	//자동 타입 변환 후의 맴버 접근
	@Override
	public void method2() {
		System.out.println("child-method2()");
	}
	
	public void method3() {
		System.out.println("child-method3()");
	}
	
}
