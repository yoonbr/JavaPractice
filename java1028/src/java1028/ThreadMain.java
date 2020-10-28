package java1028;

public class ThreadMain {

	public static void main(String[] args) {
		
		// 공유 자원을 생성 
		Product product = new Product();
		// 생산자 스레드를 생성해서 실행 
		Producer producer = new Producer(product);
		producer.start();
		// 소비자 스레드를 생성해서 실행 
		// consumer의 데이터가 없기 때문에 바로 튕기고, producer 스레드만 계속 실행 
		// 동기화, wait 해준 후 실행하면 입고는 하지만 출고는 하지 않음 
		
		Consumer consumer = new Consumer(product);
		consumer.start();

	}
}
