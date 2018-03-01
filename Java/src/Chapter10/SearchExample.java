package Chapter10;

import java.util.Arrays;

public class SearchExample {
	//�迭 �˻�
	public static void main(String[] args) {
		//�⺻ Ÿ�԰� �˻�
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε���: " + index);
		
		//���ڿ� �˻�
		String[] names = {"ȫ�浿", "�ڹ���", "������"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ã�� �ε���: " + index);
		
		//��ü �˻�
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڹ���");
		Member m3 = new Member("������");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("ã�� �ε���: " + index);
		

	}

}
