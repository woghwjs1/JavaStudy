package Chapter10;

public class ThinCloneMemberExample {
	//복제 객체를 변경하더라도 원본 객체는 변함 없음
	public static void main(String[] args) {
		//원본 객체 생성
		ThinCloneMember original = new ThinCloneMember("blue", "홍길동", "12345", 25, true);
		
		//복제 객체를 얻은 후에 패스워드 변경
		ThinCloneMember cloned = original.getThinCloneMember();
		//복제 객체의 값 변경
		cloned.id = "red";
		cloned.name = "김성민";
		cloned.password = "67890";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id : " + cloned.id);
		System.out.println("name : " + cloned.name);
		System.out.println("password : " + cloned.password);
		System.out.println("age : " + cloned.age);
		System.out.println("adult : " + cloned.adult);
		
		System.out.println();
		
		//원본 객체의 필드값 변함 없음
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id : " + original.id);
		System.out.println("name : " + original.name);
		System.out.println("password : " + original.password);
		System.out.println("age : " + original.age);
		System.out.println("adult : " + original.adult);

	}

}
