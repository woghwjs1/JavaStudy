package Chapter9;

public class NumberFormatExceptionExample {
	//NumberFormatException�� �߻��ϴ� ���
	//���ڿ��� ���ڷ� ��ȯ�� ��, ��ȯ�� �� ���� ���ڰ� �������� �߻��Ѵ�.
	public static void main(String[] args) {
		String data1 = "1000";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		//int value2 = Integer.parseInt(data2);	//�߻�����
		
		System.out.println(value1);
		//System.out.println(value2);	

	}

}
