package Chapter11;

public class ThreadGroupExample {
	//스레드 그룹을 이용한 일괄 종료 예제
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		//myGroup에 두 스레드를 포함시킴
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();//핵심
		mainGroup.list();//핵심
		
		System.out.println();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
		myGroup.interrupt();//핵심

	}

}
