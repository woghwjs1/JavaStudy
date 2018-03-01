package Chapter10;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	//�ý��� ������Ƽ �б�
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		//�����Ӽ� �б�
		System.out.println("�ü�� �̸�: " + osName);
		System.out.println("����� �̸�: " + userName);
		System.out.println("����� Ȩ���丮: " + userHome);
		
		System.out.println("------------------");
		System.out.println(" [ key ] value");
		System.out.println("------------------");
		
		//��� �Ӽ��� Ű�� ���� ���
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objkey : keys) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.println("[ key ] " + value);
		}

	}

}
