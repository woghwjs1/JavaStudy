package Chapter4Exercise;

public class Exercise07 {
	//�־��� �迭 �׸񿡼� �ִ밪�� ���غ�����.(for���� �̿��ϼ���)
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		//�ۼ� ��ġ
		for(int Max : array) {
			if(Max > max) {
				max = Max;
			}
		}
		
		
		System.out.println("max : " + max);

	}

}
