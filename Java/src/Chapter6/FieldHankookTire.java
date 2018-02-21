package Chapter6;

public class FieldHankookTire extends FieldTire{
	//FieldTire의 자식 클래스
	
	//필드
	
	//생성자
	public FieldHankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "hankookTire 수명 : " + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("타이어 펑크 " + location);
			return false;
		}
	}
}
