package java1023;

import java.util.Scanner;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		
		// 1 - 45 까지의 숫자를 중복 없이 
		// 6개 입력받아서 정렬한 후 출력 
		
		// 1. 입력 받기 위한 스캐너 인스턴스 생성 - 종료 생성 필수
		Scanner sc = new Scanner(System.in);
		
		// 2. Creat TreeSet to Int Save 
		TreeSet <Integer> lotto = new TreeSet<Integer>();
		
		// 3. TreeSet의 데이터가 6개보다 작다면 계속 수행
		while(lotto.size() < 6) {
			// 숫자 입력 받기 (메시지 입력도 같이 해주기)
			System.out.printf("1~45사이의 정수를 입력하세요:\n");
			int su = sc. nextInt();
			// 1 ~ 45 사이 숫자인지 확인
			// su가 1보다 작거나(or) 45보다 크면 메시지 출력 후 다시 리턴 ( -1안함) 
			if (su < 1 || su > 45) {
				System.out.printf("1~45사이의 정수를 입력하세요!!:\n");
				continue; // 아래쪽에 내용이 있을때 다시 올라가기 위해 
			}
			
			boolean r = lotto.add(su);
			// 데이터 중복 체크 
			if(r == false) {
				System.out.printf("중복된 숫자입니다. 다시 입력하세요:\n");
			}
		}
		// 데이터 출력 ( 
		for(Integer data : lotto) {
			System.out.printf("%d\t", data);
		}
		
		sc.close();
		
	} 
}
