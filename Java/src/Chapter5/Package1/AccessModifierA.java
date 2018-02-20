package Chapter5.Package1;

public class AccessModifierA { //Default 접근제한(다른패키지에 소속된 클래스는 접근불가)
	//클래스의 접근 제한
	
	//필드
	AccessModifierA a1 = new AccessModifierA(true);
	
	AccessModifierA a2 = new AccessModifierA(1);
	
	AccessModifierA a3 = new AccessModifierA("문자열");
	
	public int field1;
	
	int field2;
	
	private int field3;
	
	//생성자
	public AccessModifierA(boolean b) {}	//public 접근 제한
	
	AccessModifierA(int b){}				//default 접근 제한
	
	private AccessModifierA(String s) {}	//private 접근 제한
	
	public AccessModifierA() { //클래스 내부일 경우 접근제한자의 영향을 받지 않는다.
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	//메소드(접근제한 설정)
	public void method1() {	} 
	
	void method2() { }
	
	private void method3() { }
	
}
