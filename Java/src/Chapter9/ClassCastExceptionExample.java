package Chapter9;

import Chapter5.Package1.ShowTire;
import Chapter5.Package1.Tire;
import Chapter5.Package2.BigWidthTire;

public class ClassCastExceptionExample {
	//ClassCastException�� �߻��ϴ� ���
	//Ÿ�� ��ȯ�� �Ұ����� Ŭ������ �������̽� ���� Ÿ�Ժ�ȯ�� �Ϸ����ϸ� �߻��Ѵ�.
	public static void main(String[] args) {
		ShowTire showTire = new ShowTire();
		ChangTire(showTire);
		
		BigWidthTire bigTire = new BigWidthTire();
		ChangTire(bigTire);
		
	}
	
	public static void ChangTire(Tire tire) {
		//if(tire instanceof ShowTire){
			ShowTire showTire = (ShowTire) tire;
		//}
	}

}
