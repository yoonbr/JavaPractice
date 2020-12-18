package study;

import java.io.IOException;

public class study_002 {

	public static void main(String[] args) throws IOException {
		int num = 0, j; 
		Boolean isPrime = true;
		num = System.in.read();
		for(j=2; j<num; j=j+1) {
			if(num%j == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.print("소수");
		}else {
			System.out.print("소수가 아님");
		}
	}
}
