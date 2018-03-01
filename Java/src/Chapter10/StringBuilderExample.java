package Chapter10;

public class StringBuilderExample {
	//StringBuilder���� ���ڿ� ����
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();	//��ü ����
		
		sb.append("Java ");					//���ڿ� ���� �߰�
		sb.append("Program Study");			//���ڿ� ���� �߰�
		System.out.println(sb.toString());	
		
		sb.insert(4, "2");					//4��° ���� �ڿ� 2�� ���� 
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');				//4��° ���� �ڿ� ���ڸ� 6���� ����
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");	//6��° ���� �ں��� 13��° ���ڱ����� "Book"���ڿ��� ��ġ
		System.out.println(sb.toString());
		
		sb.delete(4, 5);					//5��° ���ڸ� ����
		System.out.println(sb.toString());
		
		int length = sb.length();			//�� ���� �� ���
		System.out.println("�� ���ڼ� : " + length);
		
		String result = sb.toString();		//���ۿ� �ִ� ���� StringŸ������ ����
		System.out.println(result);
		
		
		

	}

}
