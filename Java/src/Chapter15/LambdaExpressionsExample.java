package Chapter15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
	//��� ó���� ���� ���ٽ�
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿", 90),
				new Student("���ڹ�", 80) 
				);
		
		Stream<Student> stream = list.stream();	//��Ʈ�� ���
		
		//List �÷��ǿ���  Student�� ������ ���ٽ��� �Ű������� ����
		stream.forEach( s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
		

	}

}
