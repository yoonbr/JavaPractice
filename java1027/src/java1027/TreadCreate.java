package java1027;

	// Thread 클래스로부터 상속받는 클래스를 생성 
	class ThreadEx extends Thread {
		
		// 스레드로 수행할 메소드를 재정의 : public void run ()
		// 오버라이딩 
		@Override
		public void run() {
			
			// 1부터 5까지 0.5초씩 쉬면서 출력 
			// sleep은 예외처리를 반드시 해야함 try - catch - exception e
			try {
				 for(int i = 1; i <= 5; i = i + 1) { // 1부터 5까지 
					 Thread.sleep(500); // 0.5초 간격을 두고 출력 
					 System.out.printf("%d\n", i);
				 }
			 } catch (Exception e) {
				System.out.printf("예외:s\n", e.getMessage());
				e.printStackTrace(); // 예외가 발생하면 메시지를 출력하게 만듬 
			 }
		}
	} 
	// Runnable 인터페이스를 구현한 클래스 생성 
	// 클래스를 먼저 생성하고 인스턴스를 생성 
	class RunnableImpl implements Runnable {

		@Override
		public void run() {
			// 6부터 10까지 0.5초 쉬면서 출력 
			try {
				 for(int i = 6; i <= 10; i = i + 1) { // 6부터 10까지 
					 Thread.sleep(500); // 0.5초 간격을 두고 출력 
					 System.out.printf("%d\n", i);
				 }
			 } catch (Exception e) {
				System.out.printf("예외:s\n", e.getMessage());
				e.printStackTrace(); // 예외가 발생하면 메시지를 출력하게 만듬 
			 }
		
			
		}
		
	}
	
	public class TreadCreate {
	
	public static void main(String[] args) {
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		// Runnable 인터페이스를 구현한 클래스를 이용해서 스레드 생성 
		Thread th2 = new Thread(new RunnableImpl());
		th2.start();
		
		// 1~5까지, 6~10까지의 작업이 동시에 이루어짐 
		// Runnable 인터페이스를 구현한 클래스의 인스턴스를 
		// anonymous로 만들기 
		// 문법상의 방법이지 실제 스레드를 생성하는 방법은 아님 
		Thread th3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					 for(int i = 6; i <= 10; i = i + 1) { // 6부터 10까지 
						 Thread.sleep(500); // 0.5초 간격을 두고 출력 
						 System.out.printf("%d\n", i);
					 }
				 } catch (Exception e) {
					System.out.printf("예외:s\n", e.getMessage());
					e.printStackTrace(); // 예외가 발생하면 메시지를 출력하게 만듬 
				 }
			}
		});
		th3.start();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
