package Chapter14;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit>{
	//Fruit의 내림차순 정렬자
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.price < o2.price)return 1;	//가격이 적을 경우 뒤에 오게 함
		else if(o1.price == o2.price)return 0;
		else return -1;	//가격이 클 경우 앞에 오게 함
	}
	
}
