package Chapter14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	//String ��ü�� �ߺ� ���� �����ϴ� HashSet
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");	//"Java"�� �� ���� �����
		set.add("JDBC");
		set.add("servlet/JSP");
		set.add("Java");	//"Java"�� �� ���� �����
		set.add("iBATIS");
		
		int size = set.size();	//����� ��ü �� ���
		System.out.println("�� ��ü��: " + size);
		
		Iterator<String> iterator = set.iterator();	//�ݺ��� ���
		while(iterator.hasNext()) {	//��ü ����ŭ ����
			String element = iterator.next();	//�� ���� ��ü�� �����´�.
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");		//�� ���� ��ü ����
		set.remove("iBATIS");	//�� ���� ��ü ����
		
		System.out.println("�� ��ü�� : " + set.size());//����� ��ü �� ���
		
		iterator = set.iterator();	//�ݺ��� ���
		//��ü ����ŭ ����
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();	//��� ��ü�� �����ϰ� ���
		if(set.isEmpty()) {
			System.out.println("��� �ֽ�");
		}
		

	}

}
