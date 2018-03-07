package Chapter16;

import java.io.Console;

public class ConsoleExample {
	//아이디와 패스워드를 콘솔로부터 읽음
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.print("아이디: ");
		String id = console.readLine();
		
		System.out.print("패스워드: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);//char[] 배열을 문자열로 생성
		
		System.out.println("--------------");
		System.out.println(id);				//id와 Password를 콘솔에 출력
		System.out.println(strPassword);	//id와 Password를 콘솔에 출력

	}

}
