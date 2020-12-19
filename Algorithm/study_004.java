package study;

import java.util.Scanner;

public class study_004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		int K = 2; 
		do {
			int J=2;
			while(K%J !=0) {
				J = J + 1;
			}//while
			if(K==J) {
				cnt = cnt + 1;
				System.out.print(K + "\t");
			} // if 
			if (K<num) {
				K = K + 1;
			} else {
				break;
			}
		} while (true); 
		System.out.println("");
		System.out.println("입력한 " + num + "까지의 소수 개수 : " + cnt + "개");
		sc.close();
	}
}
