package java1027;

public class TreadCompare {

	public static void main(String[] args) {
	 
		Thread th1 = new Thread() {
			public void run() {
				try {
					 for(int i = 1; i <= 10; i = i + 1) {
						 Thread.sleep(1000); // 1) 여기서 1개 작업을 하고 쉬는 동안 
						 System.out.printf("%d\n", i);
					 }
				 } catch (Exception e) {}
			}
		};
		th1.start();
		
		Thread th2 = new Thread() {
			public void run() {
				try {
					 for(int i = 1; i <= 10; i = i + 1) { // 2) 다음 작업을 진행 
						 Thread.sleep(1000); 
						 System.out.printf("%d\n", i);
					 }
				 } catch (Exception e) {}
			}
		};
		th2.start();
		// 3) 1,1,2,2,3,3 ... 이런식으로 출력
	} 
}
