package java1028;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

	public static void main(String[] args) {
		
		// 동시에 3개까지 수행할 수 있는 세마포어 생성 
		Semaphore sema = new Semaphore(3);
		
		SemaphoreThread th1 = new SemaphoreThread(sema);
		SemaphoreThread th2 = new SemaphoreThread(sema);
		SemaphoreThread th3 = new SemaphoreThread(sema);
		SemaphoreThread th4 = new SemaphoreThread(sema);
		SemaphoreThread th5 = new SemaphoreThread(sema);
		SemaphoreThread th6 = new SemaphoreThread(sema);
		SemaphoreThread th7 = new SemaphoreThread(sema);

		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();

	} 
}
