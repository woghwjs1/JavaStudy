package Chapter4Exercise;

public class Exercise07 {
	//주어진 배열 항목에서 최대값을 구해보세요.(for문을 이용하세요)
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		//작성 위치
		for(int Max : array) {
			if(Max > max) {
				max = Max;
			}
		}
		
		
		System.out.println("max : " + max);

	}

}
