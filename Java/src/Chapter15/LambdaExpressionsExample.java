package Chapter15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
	//요소 처리를 위한 람다식
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("김자바", 80) 
				);
		
		Stream<Student> stream = list.stream();	//스트림 얻기
		
		//List 컬렉션에서  Student를 가져와 람다식의 매개값으로 제공
		stream.forEach( s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
		

	}

}
