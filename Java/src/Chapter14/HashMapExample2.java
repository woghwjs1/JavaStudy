package Chapter14;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	//�й��� �̸��� ������ ��� ���� Ű�� �ν�
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "ȫ�浿"), 95);//�й��� �̸��� ������ Student�� Ű�� ����
		map.put(new Student(1, "ȫ�浿"), 95);//�й��� �̸��� ������ Student�� Ű�� ����
		
		System.out.println("�� Entry �� : " + map.size());

	}

}
