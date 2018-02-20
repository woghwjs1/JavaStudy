package Chapter5.Package2;	//패키지가 다름

import Chapter5.Package1.*;

public class AccessModifierC {
	//클래스의 접근 제한
	AccessModifierA a;
	AccessModifierB b;
	
	//필드
	AccessModifierA a1 = new AccessModifierA(true);     //public 접근제한으로 접근가능	
	
	//AccessModifierA a2 = new AccessModifierA(1);	    //디폴드 접근제한으로 인한 다른패키지에선 접근 불가
	
	//AccessModifierA a3 = new AccessModifierA("문자열"); //private 접근 제한으로 아예 접근이 불가
	
	public void AccessModifierC() {
		AccessModifierA a = new AccessModifierA();
		
		a.field1 = 1;
		//a.field2 = 2;	//default 접근 제한이라 패키지가 달라서 접근불가
		//a.field3 = 3;	//private 접근 제한
		
		a.method1();
		//a.method2();	//default 접근 제한이라 패키지가 달라서 접근불가
		//a.method3();	//private 접근 제한
	}
}
