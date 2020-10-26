package java1026;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		
		// 1부터 45사이의랜덤한 정수를 생성해서 출력 
		// Random 객체 생성 
		Random r = new Random(); // 숫자를 입력하면 고정이 됨 seed가 고정되어 똑같이 나옴 
		
		// 1부터 45는 45가지 모양
		// 0~44까지 리턴되므로 + 1 해주기 
		int i = r.nextInt(45) + 1;
		for (i=0; i<6; i=i+1) { 
		System.out.printf("result: %d\n", i);
		}
		
	}
}
