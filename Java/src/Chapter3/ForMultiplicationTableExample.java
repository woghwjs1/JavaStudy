package Chapter3;

public class ForMultiplicationTableExample {
	//������ ����ϱ�
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			System.out.println("-----"+i+"��-----");
			for(int n=1; n<=9; n++) {
				System.out.println(i + " x " + n + " = " + (i*n));
			}
		}

	}

}
