package Chapter2;

public class OverflowExample {
	//�����÷ο�
	public static void main(String[] args) {
		//�����Ⱚ
		int x1 = 1000000;
		int y1 = 1000000;
		int z1 = x1 * y1;
		System.out.println(z1);
		
		//�����ذ�
		long x2 = 1000000;
		long y2 = 1000000;
		long z2 = x2 * y2;
		System.out.println(z2);

	}

}
