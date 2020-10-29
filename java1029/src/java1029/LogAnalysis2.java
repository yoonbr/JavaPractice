package java1029;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class LogAnalysis2 {
	
	public static void main(String[] args) {

	try {
		
		// 1. 파일의 내용을 문자열로 읽을 수 있는 인스턴스를 생성할 수 있어야 함 
		// 생성 후 예외 생기는지 확인 
		BufferedReader br = new BufferedReader(
				new FileReader("./log.txt"));
		
		// 제대로 복사했는지 확인 
		// 파일의 경로를 확인 후 예외가 발생하면 파일을 제대로 복사하지 않았거나 
		// 경로가 틀린 것 
		// System.out.printf("%s\n", br);
		
		// 내용 방법 후 갯수 세기 
		
				
		// 2. 데이터를 줄 단위로 읽어서 출력 - while 
		// 데이터 개수를 저장할 변수 생성 
		int cnt = 0;
		
		// IP 주소 저장을 위한 Set 생성 
		Set<String> ipSet = new HashSet<String>();
		
		// 트래픽의 합계를 저장할 변수생성  
		
		int sum = 0;
		
		while(true) {
			String line = br.readLine();
			if (line == null) {
				break;
			}
			// System.out.printf("%s\n", line); 출력 먼저 해보기 
			
			// 공백을 기준으로 문자열을 분할 = split
			String [] ar = line.split(" ");
			
			// 제대로 분할되었는지 확인 후 주석처리 
			// System.out.printf("%s\n", ar[0]); 
			// System.out.printf("%s\n", ar[8]);
			
			// 9번째 값이 200인 데이터의 개수 세기
			if (ar[8].equals("200")) {
				cnt = cnt + 1;
			}
			
			// IP를 Set에 추가 
			ipSet.add(ar[0]);
			
			int traffic = 0;
			try {
				// 문자열을 정수로 변환 
				traffic = Integer.parseInt(ar[9]);
			} catch (Exception e) {}
			
			// 변경할 수 있는 경우는 변경된 값을 더하고 
			// 그렇지 않은 경우에는 0을 더함 
			sum = sum + traffic;
			
			// sum = sum + Integer.parseInt(ar[9]);
			// -> error, java.lang.NumberFormatException: For input string: "-"
			// 음수가 포함되어있어 숫자로 바꾸다가 실패함 
			
		}
		
		System.out.printf("정상응답 : %d\n", cnt); //327 출력됨 
		
		// 접속한 데이터의 개수 
		// Set은 중복된 데이터를 저장하지 않음 
		System.out.printf("컴퓨터 개수 : %d개\n", ipSet.size());
		
		// 트래픽합계 
		System.out.printf("트래픽 합계 %d\n", sum);
		
		
		br.close();
			
		} catch (Exception e) {
		System.out.printf("%s\n", e.getMessage());
		e.printStackTrace();
		}
	
	}
}


