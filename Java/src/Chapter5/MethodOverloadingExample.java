package Chapter5;

public class MethodOverloadingExample {
	//�޼ҵ� �����ε�
	public static void main(String[] args) {
		MethodOverloading method = new MethodOverloading();
		
		//���簢�� ����
		double result1 = method.areaRectangle(10.5);
		System.out.println("���簢�� ���� : " + result1);
		
		//���簢�� ����
		double result2 = method.areaRectangle(10.5, 12.1);
		System.out.println("���簢�� ���� : " + result2);

	}

}
