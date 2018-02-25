package Chapter10;

public class DeepCloneMemberExample {
	//깊은 복제 후 복제본 변경은 원본에 영향을 미치지 않는다.
	public static void main(String[] args) {
		//원본 객체 생성
		DeepCloneMember original = new DeepCloneMember("홍길동", 25, new int[] {100,100}, new DeepCloneCar("소나타")); 
		
		//복제 객체를 얻은 후 참조값 변경
		DeepCloneMember cloned = original.getDeepCloneMember();
		cloned.scores[0] = 90;
		cloned.car.model = "그랜저"; 
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.print("scores : ");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println();
		System.out.println("car : " + cloned.car.model);
		
		System.out.println();
		
		//원본 객체의 필드값 변함 없음
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.print("scores : ");
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println();
		System.out.println("car : " + original.car.model);
		
	}

}
