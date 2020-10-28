package java1028;

public class SyncMain {

	public static void main(String[] args) {
		
		// Runnable 인터페이스를 implements 한 Sharedata를 이용해서
		// 스레드를 생성하고 시작 
		
		Thread th1 = new Thread(ShareData.sharedInstance());
		th1.start(); // 실행시키면 10초 정도 소요, 50005000 출력됨 
		
		Thread th2 = new Thread(ShareData.sharedInstance());
		th2.start(); // 148491092, 149045025, 145872476
		
		// 결과값이 0이 나오는 이유 : th1의 합게를 구한 다음 실행되는게 아닌 쉬는 중간 바로
		// 실행되어버리므로 0이 나옴 
		// 여유를 주고 생성해야함 
		try {
			// 앞의 스레드 작업을 전부 종료하고 수행하도록 하기 위해서 
			// 30초의 딜레이를 설정함 
			Thread.sleep(30000);
			System.out.printf("result:%d\n", 
				ShareData.sharedInstance().getResult());
		}catch(Exception e) {}
		
	}
}
