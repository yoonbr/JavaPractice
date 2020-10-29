package java1029;

import java.io.BufferedReader;
import java.io.FileReader;

public class CharacterRead {

	public static void main(String[] args) {
		
		try {
		// 파일을 문자열 단위로 읽을 수 있는 인스턴스를 생성 (+filereader 추가)
		
		BufferedReader br = new BufferedReader (
				new FileReader ("/Users/a202.13/Desktop/abc/studymemo.txt"));
		
		/*// 한 줄 읽기	
		// readline은 읽으면 데이터를 가져오고 못 읽으면 null 리턴 
		String line = br.readLine();
		System.out.printf("%s", line);*/
		
		// 데이터 끝까지 다 읽기 
		// 문자열을 저장할 인스턴스를 생성 
		StringBuilder sb = new StringBuilder();
		while(true) {
			// 못 읽으면 null을 리턴 
			String line = br.readLine();
			// 읽은게 없으면 종료 
			if(line == null) {
				break;
			}
			// 읽은 내용을 sb에 추가 
			sb.append(line + "\n");
		
		}
		// StringBuilde를 String 으로 변환 
		String msg = sb.toString();
		System.out.printf("%s\n", msg);
			/*// \n 안쓰면 한줄로 쭉 나옴 
			System.out.printf("%s\n", line);
				}*/
		
		br.close();
		
		} catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	//더하기 작업 여러번 할 때는 스트링 말고 스트링 빌더를 쓴 후, 다시 스트링으로 변환시킴 
	
	}
}
