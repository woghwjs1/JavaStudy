package Chapter16;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	// File Ŭ������ �̿��� ���� �� ���丮 ���� ���
	public static void main(String[] args) throws Exception{
		File dir = new File("C:/temp/Dir");
		File file1 = new File("C:/temp/file1.txt");
		File file2 = new File("C:/temp/file2.txt");
		File file3 = new File(new URI("file:///C:/temp/file3.txt")/*���� ��θ� URI ��ü�� �����ؼ� �Ű������� �����ص� ��*/);
		
		if(dir.exists()== false) {dir.mkdirs();}
		if(file1.exists()==false) {file1.createNewFile();}
		if(file2.exists()==false) {file2.createNewFile();}
		if(file3.exists()==false) {file3.createNewFile();}
		
		File temp = new File("C:/temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File[] contents = temp.listFiles();
		System.out.println("��¥		�ð�		����		ũ��		�̸�");
		System.out.println("-----------------------------------");
		for(File file : contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.println("\t<DIR>\t\t\t" + file.getName());
			}else {
				System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
		

	}

}
