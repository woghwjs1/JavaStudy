package Chapter10;

public class ThinCloneMember implements Cloneable/*복사할 수 있다는 표시*/{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public ThinCloneMember(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public ThinCloneMember getThinCloneMember() {
		ThinCloneMember cloned = null;
		try {
			cloned = (ThinCloneMember) clone();
		} catch (CloneNotSupportedException e) {}
		return cloned;
	}
}
