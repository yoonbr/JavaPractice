package java1102;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class StandardLambdaAPI {

	public static void main(String[] args) {
		
		// Consumer - 매개변수가 1개이고 리턴 타입이 없는 accept소유 
		// 문자열 데이터를 이용하는 Consumer을 생성 
		Consumer<String> consumer = 
				str -> {
					System.out.printf("%s\n", str);
				};
				consumer.accept("람다 연습");
				
				//제너릭에서 기본 자료형 사용 불가 
		Supplier<Integer> supplier = 
				() -> { 
					// 랜덤한 1~45 사이의 숫자 리턴 
					Random r = new Random();
					int su = r.nextInt(45) + 1;
					return su;
				};
			int value = supplier.get();
			System.out.printf("su : %d\n", value);
			
	}
}
