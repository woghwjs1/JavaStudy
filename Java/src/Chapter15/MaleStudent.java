package Chapter15;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
	//남학생이 저장되는 컨테이너
	private List<Student> list;//요소를 저장할 컬렉션
	
	public MaleStudent() {
		list = new ArrayList<Student>();
		System.out.println("["+Thread.currentThread().getName()/*생성자를 호출하는 스레드 이름*/+"] MaleStudent()");
	}
	
	//요소를 수집하는 메소드
	public void accmulate(Student student) {
		list.add(student);
		System.out.println("["+Thread.currentThread().getName()/*accmulate()를 호출하는 스레드 이름*/+"] accmulate()");
	}
	
	//두 MaleStudent를 결합하는 메소드 (병렬 처리 시에만 호출)
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("["+Thread.currentThread().getName()/*combine()를 호출하는 스레드 이름*/+"] combine()");
	}
	
	//요소가 저장된 컬렉션을 리턴
	public List<Student> getList(){
		return list;
	}
}
