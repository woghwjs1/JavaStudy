package Chapter9;

public class TryCatchFinallyRuntimeExceptionExample {
	//���� ���� ó��
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = "100";//args[0];
			data2 = "300";//args[1];
		} catch(Exception e) {
			System.out.println("���� ���");
			System.out.print("java ArrayIndexOutOfBoundsExceptionExample ");
			System.out.print("��1  ��2");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " : " + result);
		} catch (Exception e) {
			System.out.println("���ڷ� ��ȯ �Ұ�");
		} finally {
			System.out.println(" �ٽ� �����ϼ���. ");
		}
	}
}
