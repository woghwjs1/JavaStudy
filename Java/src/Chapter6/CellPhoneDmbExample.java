package Chapter6;

public class CellPhoneDmbExample {
	//�ڽ� Ŭ���� ���
	public static void main(String[] args) {
		//CellPhoneDmb ��ü ����
		CellPhoneDmb dmb = new CellPhoneDmb("�ڹ���", "����", 10);
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmb.model);
		System.out.println("���� : " + dmb.color);
		
		//CellPhoneDmb�� �ʵ�
		System.out.println("ä�� : " + dmb.channel);
		
		//CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("��������?");
		dmb.receiveVoice("���ϴ�.");
		dmb.hangUp();
		dmb.powerOff();
		
		//CellPhoneDmb�� �޼ҵ� ȣ��
		dmb.turnOnDmb();
		dmb.changeChannelDmb(19);
		dmb.turnOffDmb();
		

	}

}
