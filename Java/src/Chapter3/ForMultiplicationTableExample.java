package Chapter3;

public class ForMultiplicationTableExample {
	//구구단 출력하기
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			System.out.println("-----"+i+"단-----");
			for(int n=1; n<=9; n++) {
				System.out.println(i + " x " + n + " = " + (i*n));
			}
		}

	}

}
