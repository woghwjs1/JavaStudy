package Chapter15;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	//���� ������ �ҽ��� �ϴ� ��Ʈ��
	public static int sum;
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100)/*�̺κ���*/;
		stream.forEach(a -> sum += a);
		System.out.println("����: " + sum);

	}

}
