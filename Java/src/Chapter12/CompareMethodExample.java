package Chapter12;

public class CompareMethodExample {
	//���׸� �޼ҵ� ȣ��
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "���");
		
		//��ü���� Ÿ���� ��������� ����
		boolean result1 = UtilGeneric.<Integer, String>compare(p1, p2);
		
		if(result1) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		}else {
			System.out.println("�������� �������� ���� ��ü�Դϴ�.");
		}
		
		Pair<String, String> p3 = new Pair<String, String>("user1", "ȫ�浿");
		Pair<String, String> p4 = new Pair<String, String>("user2", "ȫ�浿");
		
		//��ü���� Ÿ���� ����
		boolean result2 = UtilGeneric.compare(p3, p4);
		
		if(result2) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		}else {
			System.out.println("�������� �������� ���� ��ü�Դϴ�.");
		}
	}

}
