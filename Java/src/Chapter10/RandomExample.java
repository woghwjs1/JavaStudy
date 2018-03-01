package Chapter10;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	//로또 번호 얻기
	public static void main(String[] args) {
		//선택 번호
		int[] selectNumber = new int[6];	//선택번호 6개가 저장될 배열
		Random random = new Random(3);	//선택 번호를 얻기 위한 Random 객체 생성
		System.out.println("선택 번호: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;	//선택번호를 얻어 배열에 저장
			System.out.println(selectNumber[i]+ " ");
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.println("당첨 번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) +1;
			System.out.println(winningNumber[i]+ " ");
		}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber);	//비교전 정렬
		Arrays.sort(winningNumber);	//비교전 정렬
		boolean result = Arrays.equals(selectNumber, winningNumber);//값 비교
		System.out.println("당첨 여부: ");
		if(result) {
			System.out.println("당첨되었습니다.");
		}else {
			System.out.println("당첨되지 않았습니다.");
		}

	}

}
