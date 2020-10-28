package java1028;

public class Producer extends Thread {
	
	// 공유 자원 역할을 수행할 product변수를 선언 
	private Product product;
	
	// 직접생성하지 않고 외부로 부터 데이터를 받아옴 
	// Injection(주입) : 자신이 사용할 객체를 생성자나 setter를 통해서 
	// 외부로 부터 대입 받는 것 
	public Producer(Product product) {
		this.product = product;
	}
	
	public void run() {
		for (char ch ='A'; ch<='Z'; ch = (char)(ch+1)) {
			System.out.printf("제품 %c 를 생성 \n", ch);
			product.put(ch);
		}
		
	}
}
