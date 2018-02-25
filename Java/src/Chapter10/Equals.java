package Chapter10;

public class Equals {
	//equals() 메소드
	
	public String id;
	
	public Equals(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Equals) {	//매개값이 EqualsExample타입인지 확인
			Equals ex = (Equals) obj;	//	EqualsExample타입으로 강제 타입 변환하고
			if(id.equals(ex.id)) {					//	id 필드값이 동일한지 검사한 후,
				return true;						//	동일하다면 true를 리턴
			}
		}
		return false;	//매개값이 EqualsExample타입이 아니거나 id 필드값이 다른 경우 false를 리턴
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
}
