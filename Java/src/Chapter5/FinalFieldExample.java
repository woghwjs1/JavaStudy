package Chapter5;

public class FinalFieldExample {
	//���̳� �ʵ� �׽�Ʈ
	public static void main(String[] args) {
		FinalField fin = new FinalField("�̼ҷ�", "11111-11111");
		
		System.out.println(fin.nation);
		System.out.println(fin.ssn);
		System.out.println(fin.name);
		
		//fin.nation = "usa"; 		//���̳� �ʵ�� �� ������ �Ұ����ϴ�.
		//fin.ssn = "55555-55555";	//���̳� �ʵ�� �� ������ �Ұ����ϴ�.
		fin.name = "ȫ�浿";

	}

}
