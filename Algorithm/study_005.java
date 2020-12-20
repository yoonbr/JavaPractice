package study;

import java.util.Scanner;

public class study_005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int i = 0;
		int cnt = 0; 
		int sum = 0;
		
		for(i=0; i<=100; i=i+1) {
			if(i%x == 0) {
				cnt = cnt + 1;
				sum = sum + i;
				System.out.print(i+"\t");
			} // if
		} // for 
		System.out.println();
		System.out.println("1부터 100까지의 수 중 " + x + "의 배수의 개수 : " + cnt + "개");
		System.out.println("1부터 100까지의 수 중 " + x + "의 배수의 합 : " + sum);
		
		sc.close();
	}
}
