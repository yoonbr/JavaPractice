package java1028;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy {

	public static void main(String[] args) {
		
		// 파일의 경로를 Path 클래스로 생성 ./ (현재 디렉토리) 로 시작 
		// 현재 작업 디렉토리에 있는 *파일 이름* 5.Array.pdf 파일의 경로를 생성 
		Path from = Paths.get("./5.Array.pdf");
		
		// 동일한 이름으로 *상위 디렉토리* 경로를 생성 ../ (상위 디렉토리)  
		Path to = Paths.get("..//5.Array.pdf");
		
		// 한번 더 실행하면 java.nio.file.FileAlreadyExistsException
	
		// 파일 복사
		// unhandled ~ 오류가 발생하면 예외처리함 
		try {
			Files.copy(from, to);
		} catch (IOException e) {
			// 꼭 예외메시지 처리 해줘야함 
			System.out.printf("예외 %s\n", e.getMessage());
			e.printStackTrace();
		}

	}
}
