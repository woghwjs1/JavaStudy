package Chapter11;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
	//현재 실행중인 스레드 정보
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		//프로세서에서 실행되는 모든 Thread를 가져오는 코드
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		
		for(Thread thread : threads) {
			System.out.println("Name: " + thread.getName() + 
						      ((thread.isDaemon())?"(데몬)": "(주)"));
			System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
			System.out.println();
		}

	}

}
