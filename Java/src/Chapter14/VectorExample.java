package Chapter14;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	//Board ��ü�� �����ϴ� Vector
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		//Board ��ü�� ����
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
		list.remove(2);	//2�� �ε��� ��ü(����3) ���� (���� �ε����� 1�� ������ �����)
		list.remove(3);	//3�� �ε��� ��ü(����5) ����
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}

	}

}
