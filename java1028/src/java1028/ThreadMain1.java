package java1028;

// 하나의 스레드를 여러 번 실행하는 경우에는 별도의 클래스를 만들어서 처리 
class ThreadEx extends Thread {
	@Override
	// for문의 위치에 따라서 작동하는 부분이 다르기 때문에 생각해서 넣어줌 
	public void run() {
		// 5초 동안 1초에 한 번씩 스레드라는 문자열을 출력 
		try {
			// 예외가 발생할 가능성이 있는 구문 
			for(int i = 0; i < 5; i = i + 1) { // 1부터 5까지 
				 Thread.sleep(1000); // 1초 간격을 두고 출력 
				 System.out.printf("스레드\n");
			}
			
		} catch(Exception e) {
			// 예외가 발생한 경우 처리한 구문 
			
			// 예외 메시지 출력 
			System.out.printf("예외:%s\n", e.getMessage());
			
			// 예외 추적코드를 콘솔에 출력 
			e.printStackTrace();
			
		} finally {
			// 무조건 수행하는 구문 
			System.out.printf("사용했던 자원 정리\n");
			// sc.close 대입 가능 
			} 
		}
	}
public class ThreadMain1 {

	public static void main(String[] args) {
		// 스레드로 생성해서 실행 
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		// 3초 후에 스레드 종료 
		try {
			Thread.sleep(3000); // 3초 후에 스레드 종료 
			th1.interrupt(); // *interrupt 알아두기 
		} catch(Exception e) {}
		
	}
}
