package java1029;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteFile {
	
	public static void main(String[] args) {
		
		// 파일에 바이트 단위로 기록하기 위한 스트림을 생성 
		// 작성 후 에러 확인 
		
		try {
			FileOutputStream fos = new FileOutputStream("./byte.txt", true);
			
			// 기록할 내용 생성 
			// Byte 형식으로 변환 
			String msg = "안녕하세요 파일에 기록합니다.";
			byte [] b = msg.getBytes();
			
			// 기록 
			fos.write(b);
			fos.flush();
			
			// 스트림 닫기
			fos.close();
			
			// 현재 디렉토리의 byte.txt파일의 내용을 읽어오기 
			FileInputStream fis = new FileInputStream("./byte.txt");
							// 경고 읽어보기 없앨 수 있는 방법 찾기 - 스트림 닫는 방법! 
			// fis의 전체를 저장할 수 있는 배열을 생성 
			byte [] r =  new byte [fis.available()];
			
			// 읽기
			fis.read(r);
			// 바이트 배열을 문자열로 변환 
			String str = new String(r);
			System.out.printf("%s\n", str);
			
			// 스트림 닫기 
			fis.close();
			
		} catch (Exception e) {
			System.out.printf("예외 %s\n", e.getMessage());
			e.printStackTrace();
		}
		// 실행 후 프로젝트 파일에 가서 txt 파일 열어보면 문자가 입력되어있음 
		// 한번 더 실행하면 해당 파일에 문자열이 한번 더 입력됨 
	}
}
