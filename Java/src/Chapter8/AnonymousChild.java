package Chapter8;

public class AnonymousChild {
	//�͸� �ڽ� ��ü ����
	
	//�ʵ� �ʱⰪ���� ����
	AnonymousPerson field = new AnonymousPerson() {
		void work() {
			System.out.println("����մϴ�.");
		}
		
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	void method1() {
		//���� ���������� ����
		AnonymousPerson localVar = new AnonymousPerson(){
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		
		//���� ���� ���
		localVar.wake();
	}
	
	void method2(AnonymousPerson person) {
		person.wake();
	}

}
