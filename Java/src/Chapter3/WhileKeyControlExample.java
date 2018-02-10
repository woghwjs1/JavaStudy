package Chapter3;

public class WhileKeyControlExample {
	//키보드로 while문 제어
	public static void main(String[] args) throws Exception{
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("-------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-------------------");
				System.out.println("선택 : ");
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49) { //1을 읽었을 경우
				speed++;
				System.out.println("현재 속도=" + speed);
			}else if(keyCode == 50) { //2을 읽었을 경우
				speed--;
				System.out.println("현재 속도=" + speed);
			}else if(keyCode == 51) { //3을 읽었을 경우
				run = false;
			}
		}
		
		System.out.println("중지합니다.");

	}

}
