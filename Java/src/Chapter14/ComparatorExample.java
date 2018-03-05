package Chapter14;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
	//�������� �����ڸ� ����ϴ� TreeSet
	public static void main(String[] args) {
		/*
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
		//Fruit�� Comparable�� �������� �ʾұ� ������ ���� �߻�
		treeSet.add(new Fruit("����", 3000));
		treeSet.add(new Fruit("����", 10000));
		treeSet.add(new Fruit("����", 6000));
		*/
		
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator()/*�������� ������ ����*/);
		//����� �� ������ �������� �������� ���ĵ�
		treeSet.add(new Fruit("����", 3000));
		treeSet.add(new Fruit("����", 10000));
		treeSet.add(new Fruit("����", 6000));
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ":" + fruit.price);
		}
		

	}

}
