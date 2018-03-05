package Chapter14;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	//���̵�� ��й�ȣ �˻��ϱ�
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		//���̵�� ��й�ȣ�� �̸� �����Ų��.
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		//Ű����κ��� �Էµ� ������ �ޱ� ���� ����
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.println("���̵�: ");
			String id = scanner.nextLine();//Ű����� �Է��� ���̵� �д´�.
			
			System.out.println("��й�ȣ: ");
			String password = scanner.nextLine();//Ű����� �Է��� ��й�ȣ�� �д´�.
			System.out.println();
			
			if(map.containsKey(id)) {//���̵��� Ű�� �����ϴ��� Ȯ���Ѵ�.
				if(map.get(id).equals(password)) {//��й�ȣ�� ���Ѵ�.
					System.out.println("�α��� �Ǿ����ϴ�");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}

	}

}
