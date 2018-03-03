package Chapter12;

public class Course<T> {
	//���׸� Ÿ��
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		//Ÿ�� �ĸ����ͷ� �迭�� �����Ϸ��� new T[n]���·� �迭�� ������ �� ����
		//(T[]) (new Object[n])���� �����ؾ� �Ѵ�.
		students = (T[]) (new Object[capacity]);
	}
	
	public String getName() {return name;}
	public T[] getStudents() { return students; }
	
	//�迭�� ����ִ� �κ��� ã�Ƽ� �������� �߰��ϴ� �޼ҵ�
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
