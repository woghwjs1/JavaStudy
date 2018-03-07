package Chapter15;

import java.util.Arrays;
import java.util.List;

public class StreamPiprlinesExample {
	// 스트림 파이프라인
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("김나리", Member.FEMALE, 20),
				new Member("홍두께", Member.MALE, 45),
				new Member("박나래", Member.FEMALE, 27)
				);
		
		//중요부분
		double ageAvg = list.stream()
				.filter(m -> m.getSex()==Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		
		System.out.println("남자 평균 나이: " + ageAvg);

	}

}
