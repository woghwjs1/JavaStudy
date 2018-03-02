package Chapter11;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample extends Thread{
	//�۾� �Ϸ� ������ �뺸�ޱ�
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		//CompletionService ����
		CompletionService<Integer> completionService = 
				new ExecutorCompletionService<Integer>(executorService);
		
		System.out.println("[�۾� ó�� ��û]");
		for(int i=0; i<3; i++) {
			
			//������Ǯ���� �۾� ó�� ��û
			completionService.submit(new Callable<Integer>(){
				@Override
				public Integer call() throws Exception{
					int sum = 0;
					for(int i=1; i<=10; i++) {
						sum += i;
					}
					return sum;
				}
			});
		}
		
		
		System.out.println("[ó�� �Ϸ�� �۾� Ȯ��]");
		executorService.submit(new Runnable() {//������Ǯ�� �����忡�� �����ϵ��� ��
			@Override
			public void run() {
				while(true) {
					try {
						Future<Integer> future = completionService.take();//�Ϸ�� �۾� ��������
						int value = future.get();
						System.out.println("[ó�� ���] " + value);
					} catch (Exception e) {
						break;
					}
				}
			}
		});
		//3�� �� ������Ǯ ����
		try {Thread.sleep(3000);} catch (InterruptedException e) { }
		executorService.shutdown();

	}

}
