package Chapter16;

import java.io.FileInputStream;

public class FileInputStreamExample {
	// �ؽ�Ʈ ������ �а� ���
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"C:/(�������� ��ġ�� ���� ����)"
					);
			int data;
			
			//1����Ʈ�� �а� �ֿܼ� ���
			while((data = fis.read() ) != -1) {
				System.out.write(data);
			}
			
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
