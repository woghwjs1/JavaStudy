package Chapter10;

import java.util.Comparator;

import Chapter10.CompareExample.Student;

public class CompareStudent implements Comparator<Student>{
	//�л� ��ȣ ����
	@Override
	public int compare(Student a, Student b) {
		if(a.sno < b.sno) return -1;
		else if(a.sno == b.sno) return 0;
		else return 1;
	}
}
