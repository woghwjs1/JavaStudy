package Chapter5.Package1;	//패키지 동일

public class AccessModifierB {
	//클래스의 접근 제한
	AccessModifierA a; // (O) A클래스 접근가능(필드로 선언할 수 있음)
	
	//필드
	AccessModifierA a1 = new AccessModifierA(true);
	
	AccessModifierA a2 = new AccessModifierA(1);
	
	//AccessModifierA a3 = new AccessModifierA("문자열"); //private 생성자 접근불가
	
	public void AccessModifierB() {
		
	AccessModifierA a = new AccessModifierA();
	
	a.field1 = 1;
	
	a.field2 = 2;
	
	//a.field3 = 3; //private 접근 제한으로 접근 불가
	
	a.method1();
	
	a.method2();
	
	//a.method3();	//private 접근 제한으로 접근 불가
	}
}
