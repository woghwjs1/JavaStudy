package Chapter14;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit>{
	//Fruit�� �������� ������
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.price < o2.price)return 1;	//������ ���� ��� �ڿ� ���� ��
		else if(o1.price == o2.price)return 0;
		else return -1;	//������ Ŭ ��� �տ� ���� ��
	}
	
}
