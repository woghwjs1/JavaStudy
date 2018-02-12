package Chapter4Exercise;

import java.util.Scanner;

public class Exercise09 {
	//다음은 키보드로부터 학생의 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램 입니다.
	//실행 결과를 보고, 알맞게 작성해보세요(참고로 16라인에서 Scanner의 newxtInt() 메소드는 콘솔에 입력된
	//숫자를 읽고 리턴합니다.)
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.학생수|2.입력|3.리스트|4.분석|5.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			//작성위치
			if(selectNo == 1) {
				System.out.print("학생수> ");
				selectNo = scanner.nextInt();
				studentNum = selectNo;
			}else if(selectNo == 2){
				scores = new int[studentNum];
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "] : ");
					selectNo = scanner.nextInt();
					scores[i] = selectNo;
				}
			}else if(selectNo == 3){
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			}else if(selectNo == 4){
				int max = 0;
				int sum = 0;
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("점수 총합 : " + sum);
				System.out.println("점수 평균 : " + (double)sum/studentNum);
				System.out.println("최고 점수 : " + max);
			}else if(selectNo == 5){
				run = false;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");

	}

}
