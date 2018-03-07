package Chapter15;

import java.util.Arrays;
import java.util.List;

public class SequencialVsParallelExample {
	//���� ó���� ���� ó�� ���� ��
	
	//���ó��
	public static void work(int value) {
		try {Thread.sleep(100/*���� �������� ����ó���� ����*/);} catch (InterruptedException e) {}
	}
	
	//���� ó��
	public static long testSequencial(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().forEach((a)->work(a));
		long end = System.nanoTime();
		long runTime = end - start;
		return runTime;
	}
	
	//���� ó��
	public static long testParallel(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach((a)->work(a));
		long end = System.nanoTime();
		long runTime = end - start;
		return runTime;
	}
	
	public static void main(String[] args) {
		//�ҽ� �÷���
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		//���� ��Ʈ�� ó�� �ð� ���ϱ�
		long timeSequencial = testSequencial(list);
		
		//���� ��Ʈ�� ó�� �ð� ���ϱ�
		long timeParallel = testParallel(list);
		
		if(timeSequencial < timeParallel) {
			System.out.println("���� �׽�Ʈ ���: ���� ó���� �� ����");
		}else {
			System.out.println("���� �׽�Ʈ ���: ���� ó���� �� ����");
		}

	}

}
