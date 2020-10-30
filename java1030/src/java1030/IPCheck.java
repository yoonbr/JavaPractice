package java1030;

import java.net.InetAddress;

public class IPCheck {
	
	public static void main(String[] args) {
		
		try {
			// 현재 컴퓨터의 IP와 이름을 확인 
			InetAddress localhost = 
					InetAddress.getLocalHost();
			System.out.printf("이름 : %s\n", localhost.getHostName());
			System.out.printf("IP : %s\n", localhost.getHostAddress());
			
			// daum 페이지의 이름과 IP를 확인 
			InetAddress daum = 
					InetAddress.getByName("www.daum.net");
					System.out.printf("이름 : %s\n", daum.getHostName());
					System.out.printf("IP : %s\n", daum.getHostAddress());
					
		} catch (Exception e) {
			System.out.printf("예외%s\n", e.getMessage());
			e.printStackTrace();
		}
		
	}
}
