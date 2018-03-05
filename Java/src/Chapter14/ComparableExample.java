package Chapter14;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	//����� ���� ��ü�� ���� ������ �����ϱ�
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		//����� �� ���� ������ ���ĵ�
		treeSet.add(new Person("ȫ�浿", 45));
		treeSet.add(new Person("���ڹ�", 25));
		treeSet.add(new Person("������", 31));
		
		Iterator<Person> iterator = treeSet.iterator();//���� ������ ��忡�� ������ ������ ������ �ݺ��ؼ� ��������(��������)
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}//���� ������ ��忡�� ������ ������ ������ �ݺ��ؼ� ��������(��������)

	}

}
