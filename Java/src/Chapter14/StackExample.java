package Chapter14;

import java.util.Stack;

public class StackExample {
	//Stack�� �̿��� �������̽�
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//������ ����
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {//�������̽��� ������� Ȯ��
			Coin coin = coinBox.pop();//�������̽����� ���� ���� ���� ������
			System.out.println("������ ����: " + coin.getValue() + "��");
		}

	}

}
