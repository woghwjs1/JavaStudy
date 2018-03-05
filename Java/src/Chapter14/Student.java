package Chapter14;

public class Student {
	//Ű�� ����� ��ü - hashCode()�� equals() ������
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equals(Object obj) {//�й��� �̸��� ������ ��� true��  ����
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno==student.sno) && (name.equals(student.name));
		}else {
			return false;
		}
	}
	
	public int hashCode() {	//�й��� �̸��� ���ٸ� ������ ���� ����
		return sno + name.hashCode();
	}
}
