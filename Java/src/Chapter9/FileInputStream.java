package Chapter9;

public class FileInputStream implements AutoCloseable{
	//AutoCloseable ���� Ŭ����
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "�� �н��ϴ�.");
	}
	
	@Override
	public void close() throws Exception{
		System.out.println(file + "�� �ݽ��ϴ�.");
	}
	
	
}
