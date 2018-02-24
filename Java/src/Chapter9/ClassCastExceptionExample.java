package Chapter9;

import Chapter5.Package1.ShowTire;
import Chapter5.Package1.Tire;
import Chapter5.Package2.BigWidthTire;

public class ClassCastExceptionExample {
	//ClassCastException이 발생하는 경우
	//타입 변환이 불가능한 클래스나 인터페이스 간에 타입변환을 하려고하면 발생한다.
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
