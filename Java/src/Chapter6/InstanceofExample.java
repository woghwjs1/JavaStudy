package Chapter6;

public class InstanceofExample {
	//객체 타입 확인
	public static void method1(InstanceofParent parent) {
		if(parent instanceof InstanceofChild) {
			InstanceofChild child = (InstanceofChild) parent;
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method1 - Child로 변환 실패");
		}
	}
	
	public static void method2(InstanceofParent parent) {
		InstanceofChild child = (InstanceofChild) parent;	//ClassCastException이 발생할 가능성이 있슴.
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		InstanceofParent parentA = new InstanceofChild();
		method1(parentA);
		method2(parentA);
		
		InstanceofParent parentB = new InstanceofParent();
		method1(parentB);
		method2(parentB);	//예외 발생
	}
	
}
