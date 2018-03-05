package Chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
	//디렉토리 내용을 소스로 하는 스트림
	public static void main(String[] args) throws IOException{
		Path path = Paths.get("C:/JavaProgramming/source");
		Stream<Path> stream = Files.list(path);
		stream.forEach( p/*서브 디렉토리 또는 파일에 해당하는 Path 객체*/ -> System.out.println(p.getFileName()/*서브 디렉토리 이름 또는 파일 이름 리턴*/));

	}

}
