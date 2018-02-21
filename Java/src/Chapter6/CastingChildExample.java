package Chapter6;

public class CastingChildExample {

	public static void main(String[] args) {
		CastingParent parent = new CastingChild();	//자동 타입 변환
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.method3();				//(부모클래스에 없으므로 불가능)
		//parent.field2 = "data2";		//(부모클래스에 없으므로 불가능)
		
		CastingChild child = (CastingChild) parent; //강제 타입 변환
		
		child.field2 = "data2";
		child.method3();

	}

}
