package Chapter15;

import java.util.Arrays;
import java.util.List;

public class StreamPiprlinesExample {
	// ��Ʈ�� ����������
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", Member.MALE, 30),
				new Member("�質��", Member.FEMALE, 20),
				new Member("ȫ�β�", Member.MALE, 45),
				new Member("�ڳ���", Member.FEMALE, 27)
				);
		
		//�߿�κ�
		double ageAvg = list.stream()
				.filter(m -> m.getSex()==Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		
		System.out.println("���� ��� ����: " + ageAvg);

	}

}
