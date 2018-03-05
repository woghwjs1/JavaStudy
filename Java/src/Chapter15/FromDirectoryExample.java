package Chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
	//���丮 ������ �ҽ��� �ϴ� ��Ʈ��
	public static void main(String[] args) throws IOException{
		Path path = Paths.get("C:/JavaProgramming/source");
		Stream<Path> stream = Files.list(path);
		stream.forEach( p/*���� ���丮 �Ǵ� ���Ͽ� �ش��ϴ� Path ��ü*/ -> System.out.println(p.getFileName()/*���� ���丮 �̸� �Ǵ� ���� �̸� ����*/));

	}

}
