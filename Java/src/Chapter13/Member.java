package Chapter13;

public class Member {
	//ȸ�� Ŭ����
	private String name;
	private String id;
	private Address address;
	
	public Member(String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public Member(String id) {
		System.out.println("Member(String id) ����");
		this.id = id;
	}
	
	public Member(String name, String id) {
		System.out.println("Member(String name, String id) ����");
		this.id = id;
		this.name = name;
	}
	
	public String getName() {return name;}
	public String getId() {return id;}
	public Address getAddress() {return address;}
	

}
