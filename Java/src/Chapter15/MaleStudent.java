package Chapter15;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
	//���л��� ����Ǵ� �����̳�
	private List<Student> list;//��Ҹ� ������ �÷���
	
	public MaleStudent() {
		list = new ArrayList<Student>();
		System.out.println("["+Thread.currentThread().getName()/*�����ڸ� ȣ���ϴ� ������ �̸�*/+"] MaleStudent()");
	}
	
	//��Ҹ� �����ϴ� �޼ҵ�
	public void accmulate(Student student) {
		list.add(student);
		System.out.println("["+Thread.currentThread().getName()/*accmulate()�� ȣ���ϴ� ������ �̸�*/+"] accmulate()");
	}
	
	//�� MaleStudent�� �����ϴ� �޼ҵ� (���� ó�� �ÿ��� ȣ��)
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("["+Thread.currentThread().getName()/*combine()�� ȣ���ϴ� ������ �̸�*/+"] combine()");
	}
	
	//��Ұ� ����� �÷����� ����
	public List<Student> getList(){
		return list;
	}
}
