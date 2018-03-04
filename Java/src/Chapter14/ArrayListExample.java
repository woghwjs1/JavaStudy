package Chapter14;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	//String ��ü�� �����ϴ�  ArrayList
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");	//String ��ü�� ����
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		
		int size = list.size();	//����� �� ��ü�� ���
		System.out.println("�� ��ü�� : " + size);
		System.out.println();
		
		
		String skill = list.get(2);	//2�� �ε����� ��ü ���
		System.out.println("2: " + skill);
		System.out.println();
		
		
		for(int i=0; i<list.size(); i++) {	//����� �� ��ü ����ŭ ����
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		
		list.remove(2);	//2�� �ε����� ��ü(Database) ������
		list.remove(2);	//2�� �ε����� ��ü(Servlet/JSP) ������
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {	//����� �� ��ü����ŭ ����
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}

	}

}
