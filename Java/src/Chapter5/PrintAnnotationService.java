package Chapter5;

public class PrintAnnotationService {
	//������̼� ���� Ŭ����
	@PrintAnnotation
	public void method1() {
		System.out.println("���� ����1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("���� ����2");
	}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("���� ����3");
	}
}
