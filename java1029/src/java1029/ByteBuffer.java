package java1029;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class ByteBuffer {

	public static void main(String[] args) {
		
		try {	
		// 절대 경로를 이용해서 파일에 기록할 수 있도록 (경로 - 바탕화면 폴더)
		// PrintStream을 생성 
		/* PrintStream ps = new PrintStream (파일경로/파일이름.확장자"); */
		PrintStream ps = new PrintStream (
			"/Users/a202.13/Desktop/bonnie/bonnies.txt");
		// 기록할 내용 만들기 
		String msg = "버퍼를 이용한 바이트 출력";
		
		ps.print(msg.getBytes());
		ps.close();
		
		System.out.printf("기록 성공 \n");
		
		// 파일에서 버퍼를 이용해서 읽어오기 
		BufferedInputStream bis = 
				new BufferedInputStream(
						new FileInputStream("/Users/a202.13/Desktop/abc/abc.txt"));
		
		// error - stream 잘못 적음 
		
		// 데이터를 저장하기 위한 바이트 배열 
		byte [] r = new byte[bis.available()];
		
		// 읽기
		bis.read(r);
		
		// 문자열로 변환해서 출력 
		String str = new String(r);	
		System.out.printf("%s\n", str);
		
		bis.close();
		
	} catch (Exception e) {
		System.out.printf("%s\n", e.getMessage());
		e.printStackTrace();
	}

	}
}


