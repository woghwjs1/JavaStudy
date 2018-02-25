package Chapter10;

public class Equals {
	//equals() �޼ҵ�
	
	public String id;
	
	public Equals(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Equals) {	//�Ű����� EqualsExampleŸ������ Ȯ��
			Equals ex = (Equals) obj;	//	EqualsExampleŸ������ ���� Ÿ�� ��ȯ�ϰ�
			if(id.equals(ex.id)) {					//	id �ʵ尪�� �������� �˻��� ��,
				return true;						//	�����ϴٸ� true�� ����
			}
		}
		return false;	//�Ű����� EqualsExampleŸ���� �ƴϰų� id �ʵ尪�� �ٸ� ��� false�� ����
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
}
