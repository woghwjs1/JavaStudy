package Chapter16;

import java.io.InputStream;

public class SystemInExample2 {
	// 콘솔에서 입력한 한글 알아내기
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		
		byte[] datas = new byte[100];
		
		System.out.print("이름 : ");
		int nameBytes = is.read(datas);
		String name = new String(datas, 0, nameBytes-2/*끝에 2바이트는 Enter키에 해당하는 캐리지 리턴(13)과 라인 피드(10)이므로 문자열에서 제외시킴 */);
		
		System.out.print("하고싶은 말: ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-2/*끝에 2바이트는 Enter키에 해당하는 캐리지 리턴(13)과 라인 피드(10)이므로 문자열에서 제외시킴 */);
		
		System.out.println("입력한 이름: " + name);
		System.out.println("입력한 하고 싶은말: " + comment);

	}

}
