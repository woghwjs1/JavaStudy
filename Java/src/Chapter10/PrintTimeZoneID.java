package Chapter10;

import java.util.TimeZone;

public class PrintTimeZoneID {
	//��� ������ �ð��� ���ڿ� ���
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}

	}

}
