package Chapter13;

public class MyFunctionalInterfaceExample3 {
	//���ٽ�
	public static void main(String[] args) {
		MyFunctionalInterface3 fi;
		
		fi= (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;//���๮�� �ϳ���� {}���� ����
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> sum(x, y);//���๮�� �ϳ���� {}���� ����
		System.out.println(fi.method(2, 5));

	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}

}