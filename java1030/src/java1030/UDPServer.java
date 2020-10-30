package java1030;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	
	public static void main(String[] args) {
		
	// UDP를 이용한 Unicast 통신 
	// 예외처리 
	try {	
		// 받는 쪽은 포트 번호와 함께 소켓을 생성 
		DatagramSocket dsoc = new DatagramSocket(9393);
		
		// 계속해서 받을 무한 반복문 작성 
		while(true) {
			// 전송된 데이터를 저장할 배열을 생성
			// 바이트의 데이터 수 보다 작으면 글자수의 공백이 생김 
			byte [] b = new byte[65536];
			// 데이터 패킷을 생성 
			DatagramPacket dp = 
					new DatagramPacket(b, b.length);
			System.out.printf("Server waiting.....\n");
			
			// 받기 
			dsoc.receive(dp);
			// 받은 내용을 문자열로 만들어서 출력 
			String msg = new String(b);
			System.out.printf("%s\n", msg.trim());
			
			dsoc.close();
		}
		
	} catch (Exception e) {
		System.out.printf("예외%s\n", e.getMessage());
		e.printStackTrace();
		}
	
	}
}