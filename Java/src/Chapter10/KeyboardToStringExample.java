package Chapter10;

import java.io.IOException;

public class KeyboardToStringExample {
	//바이트 배열을 문자열로 변환
	public static void main(String[] args) throws IOException{
		byte[] bytes = new byte[100];	// 읽은 바이트를 저장하기 위한 배열 생성
		
		System.out.println("입력 : ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0 , readByteNo-2);
		System.out.println(str);
		
		

	}

}
