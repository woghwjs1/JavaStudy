package Chapter5;

public class KoreanExample {
	//객체 생성 후 필드값 출력
	public static void main(String[] args) {
		Korean k1 = new Korean("열라리", "010-2222-2222");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("알라리", "010-3333-3333");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);

	}

}
