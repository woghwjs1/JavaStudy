package Chapter5;

public class FinalFieldExample {
	//파이널 필드 테스트
	public static void main(String[] args) {
		FinalField fin = new FinalField("이소룡", "11111-11111");
		
		System.out.println(fin.nation);
		System.out.println(fin.ssn);
		System.out.println(fin.name);
		
		//fin.nation = "usa"; 		//파이널 필드는 값 수정이 불가능하다.
		//fin.ssn = "55555-55555";	//파이널 필드는 값 수정이 불가능하다.
		fin.name = "홍길동";

	}

}
