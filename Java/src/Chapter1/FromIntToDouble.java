package Chapter1;

public class FromIntToDouble {
	//������ Ÿ���� �Ǽ� Ÿ������ ��ȯ�� �� ���е� �ս��� ���Ѵ�.
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		System.out.println(num3);
		
		num2 = (int) num3;
		System.out.println(num2);
		
		int result = num1 - num2;
		System.out.println(result);
	}

}
