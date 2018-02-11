package Chapter4;

public class EnumMethodExample {
	//���� ��ü�� �޼ҵ�
	public static void main(String[] args) {
		//name() �޼ҵ� (���� ��ü�� ������ �ִ� ���ڿ� ����)
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() �޼ҵ� (���� ��ü�� ���° �������� �˷���)
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() �޼ҵ� (�־��� ���� ��ü�� �������� ���� ���° ��ġ�ϴ����� ���Ѵ�.)
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() �޼ҵ� (�Ű������� �־����� ���ڿ��� ������ ���ڿ��� ������ ���� ��ü�� �����Ѵ�.)
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ��̱���");
			}else {
				System.out.println("�����̱���");
			}
		}
		
		//values() �޼ҵ� (����Ÿ���� ��� ���� ��ü���� �迭�� ����� �����Ѵ�.)
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
