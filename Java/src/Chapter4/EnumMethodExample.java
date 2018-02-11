package Chapter4;

public class EnumMethodExample {
	//열거 객체의 메소드
	public static void main(String[] args) {
		//name() 메소드 (열거 객체가 가지고 있는 문자열 리턴)
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() 메소드 (열거 객체중 몇번째 순서인지 알려줌)
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드 (주어진 열거 객체를 기준으로 전후 몇번째 위치하는지를 비교한다.)
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드 (매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴한다.)
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요");
			}else {
				System.out.println("평일이군요");
			}
		}
		
		//values() 메소드 (열거타입의 모든 열거 객체들을 배열로 만들어 리턴한다.)
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
