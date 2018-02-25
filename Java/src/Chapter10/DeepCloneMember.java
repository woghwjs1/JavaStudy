package Chapter10;

import java.util.Arrays;

public class DeepCloneMember implements Cloneable{
	//clone()�� �������ؼ� ���� ������ ����
	public String name;
	public int age;
	public int[] scores;	//����Ÿ�� �ʵ� �������� ���
	public DeepCloneCar car;			//����Ÿ�� �ʵ� �������� ���
	
	public DeepCloneMember(String name, int age, int[] scores, DeepCloneCar car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		//���� ���� ���縦 �ؼ� name, age�� �����Ѵ�
		DeepCloneMember cloned = (DeepCloneMember) super.clone();
		
		//scores�� ���� �����Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		
		//car�� ���� �����Ѵ�.
		cloned.car = new DeepCloneCar(this.car.model);
		
		//���� ������ DeepCloneMember ��ü�� ����
		return cloned;
	}
	
	public DeepCloneMember getDeepCloneMember() {
		DeepCloneMember cloned = null;
		try {
			cloned = (DeepCloneMember) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
