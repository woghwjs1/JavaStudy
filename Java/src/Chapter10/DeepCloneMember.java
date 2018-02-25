package Chapter10;

import java.util.Arrays;

public class DeepCloneMember implements Cloneable{
	//clone()을 재정의해서 깊은 복제로 변경
	public String name;
	public int age;
	public int[] scores;	//참조타입 필드 깊은복제 대상
	public DeepCloneCar car;			//참조타입 필드 깊은복제 대상
	
	public DeepCloneMember(String name, int age, int[] scores, DeepCloneCar car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		//먼저 얕은 복사를 해서 name, age를 복제한다
		DeepCloneMember cloned = (DeepCloneMember) super.clone();
		
		//scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		
		//car를 깊은 복제한다.
		cloned.car = new DeepCloneCar(this.car.model);
		
		//깊은 복제된 DeepCloneMember 객체를 리턴
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
