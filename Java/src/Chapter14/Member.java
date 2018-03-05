package Chapter14;

public class Member {
	//hashCode()와 equals() 메소드 재정의
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	//name과 age 값이 같으면 true르 리턴
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age);
		}else {
			return false;
		}
	}
	
	@Override
	//name과 age값이 같으면 동일한 hashCode가 리턴
	public int hashCode() {
		return name.hashCode() + age;
	}
}
