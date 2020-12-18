package study;

import java.util.Scanner;

public class study_003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		int sum = 0;
		int K = 2; 
		do {
			int J = 2; 
			while(K%J != 0) {
				J = J + 1;
			}
			if(K==J) {
				sum = sum + K;
				System.out.print(K+"\t");
			}
			if(K<num) {
				K = K + 1;
			} else {
				break;
			} 
		} while(true); 
			System.out.println("\n");
			System.out.println("입력한 " + num + "까지 소수의 합: " + sum);
		
			sc.close();
	} 
}
