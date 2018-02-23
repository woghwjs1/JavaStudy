package Chapter8;

public class AnonymousChild {
	//익명 자식 객체 생성
	
	//필드 초기값으로 대입
	AnonymousPerson field = new AnonymousPerson() {
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method1() {
		//로컬 변수값으로 대입
		AnonymousPerson localVar = new AnonymousPerson(){
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		
		//로컬 변수 사용
		localVar.wake();
	}
	
	void method2(AnonymousPerson person) {
		person.wake();
	}

}
