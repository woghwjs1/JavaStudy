package Chapter8;

public class AnonymousChildExample {
	//익명 자식 객체 생성
	public static void main(String[] args) {
		AnonymousChild anony = new AnonymousChild();
		//익명 객체 필드 사용
		anony.field.wake();
		
		//익명 객체 로컬 변수 사용
		anony.method1();
		
		//익명 객체 매개값 사용
		anony.method2(
				new AnonymousPerson() {
					void study() {
						System.out.println("공부합니다.");
					}
					
					@Override
					void wake() {
						System.out.println("8시에 일어납니다");
						study();
					}
				}
				);
		

	}

}
