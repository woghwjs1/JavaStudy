package Chapter12;

public class BoundedTypeParameterExample {
	//���׸� �޼ҵ� ȣ��
	public static void main(String[] args) {
		//String str = Util3.compare("a", "b"); //(X) String�� Number Ÿ���� �ƴ�
		
		int result1 = Util3.compare(10, 20);	//int -> Integer (�ڵ� Boxing)
		System.out.println(result1);
		
		int result2 = Util3.compare(4.5, 3);	//double -> Double (�ڵ� Boxing)
		System.out.println(result2);

	}

}
