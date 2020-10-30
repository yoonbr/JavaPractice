package java1030;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class DaumHtml {

	public static void main(String[] args) {

		try {
			// 홈페이지 전체 내용 가져오기 
			// 접속할 곳의 주소를 생성 
			InetAddress daum = InetAddress.getByName("www.daum.net");
			
			// 접속할 곳의 포트번호 
			int port = 80;
			
			// 소켓 생성 
			// 여기까지가 접속 
			Socket socket = new Socket(daum, port);
			
			// 문자열 전송 
			// 보내는건 아웃풋 
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			
			pw.println("GET http://www.daum.net");
			pw.flush(); // 프린트 후엔 항상 플러시 해주기 
			
			// 문자열 읽기 
			// 메시지를 읽어오는 것. 읽고 쓰기가 가능해야 함 
			BufferedReader br = new BufferedReader (
					new InputStreamReader(
							socket.getInputStream()));
			
			StringBuilder sb = new StringBuilder();
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line + "\n");
			}
			// 다 가져온 후 다시 문자열 자료형으로 바꿈 
			
			String html = sb.toString();
			System.out.printf("%s", html);
			
			// 스트림 닫기
			pw.close();
			
			// 소켓 닫기 (항상 닫아줘야함)
			socket.close();
			
		} catch (Exception e) {
			System.out.printf("예외%s\n", e.getMessage());
			e.printStackTrace();
		}

	}
}
