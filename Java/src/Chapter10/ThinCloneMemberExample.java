package Chapter10;

public class ThinCloneMemberExample {
	//���� ��ü�� �����ϴ��� ���� ��ü�� ���� ����
	public static void main(String[] args) {
		//���� ��ü ����
		ThinCloneMember original = new ThinCloneMember("blue", "ȫ�浿", "12345", 25, true);
		
		//���� ��ü�� ���� �Ŀ� �н����� ����
		ThinCloneMember cloned = original.getThinCloneMember();
		//���� ��ü�� �� ����
		cloned.id = "red";
		cloned.name = "�輺��";
		cloned.password = "67890";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id : " + cloned.id);
		System.out.println("name : " + cloned.name);
		System.out.println("password : " + cloned.password);
		System.out.println("age : " + cloned.age);
		System.out.println("adult : " + cloned.adult);
		
		System.out.println();
		
		//���� ��ü�� �ʵ尪 ���� ����
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id : " + original.id);
		System.out.println("name : " + original.name);
		System.out.println("password : " + original.password);
		System.out.println("age : " + original.age);
		System.out.println("adult : " + original.adult);

	}

}
