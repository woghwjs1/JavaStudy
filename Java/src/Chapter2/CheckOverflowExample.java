package Chapter2;

public class CheckOverflowExample {
	//��� ���� ���� �����÷ο츦 Ž��
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ���Ұ�");
		}
	}
	
	public static int safeAdd(int left, int right) {
		if(right > 0) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}else {
			if(left > (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		return left + right;
	}

}
