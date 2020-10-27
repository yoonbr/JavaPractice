package java1027;

	// 자신의 스레드 이름을 1초마다 5번 출력하는 스레드 클래스를 생성 
	class ThreadFive extends Thread {
		// 항상 해당 메시지를 오버라이딩 해야함 
		@Override
		public void run () {
			try {
				 for(int i = 0; i < 5; i = i + 1) { // 5번 출력 
					 Thread.sleep(1000); // 1초 간격을 두고 출력 
					 System.out.printf("%s\n", getName());
				 }
			 } catch (Exception e) {
				System.out.printf("s\n", e.getMessage()); // 예외 메시지 출력 
				e.printStackTrace(); // 무슨 문제인지 printstacktrace로 찾음 
			 }
		}
	}
	
public class DaemonAndPriority {
		
	public static void main(String[] args) {
		
		ThreadFive five = new ThreadFive();
		// 스레드를 시작하기 전에 daemon 으로 설정 
		// 다른 스레드가 수행중이 아니면 자동 종료 
		// Back-End Server 나 Download를 구현할 때 중요
		// Andriod에서는 이를 대체하는 Service 라는 개념이 존재 
		five.setDaemon(true);
		
		five.start();
		try {
			Thread.sleep(3000);
			System.out.printf("메인 스레드 종료\n");
			
		} catch(Exception e) {
			
		} // 스레드 종료가 되더라도 맨 위 스레드는 계속 실행됨 

	}
}
