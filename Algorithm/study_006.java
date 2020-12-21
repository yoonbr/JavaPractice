package study;

import java.util.Scanner;

public class study_006 {
	public static void main(String[] args) {
		
		int i, j, num, p = 0;
		int [] a = new int [100];
		
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(j=1; j<=num; j=j+1) {
			if(num%j == 0) {
				p = p + 1;
				a[p]=j;
			} // if
		} // for 
		System.out.println("약수 출력 결과");
		for(i=1; i<=p; i=i+1) {
			System.out.println(i+"번째 : " + a[i]);
		}
		
		sc.close();
	}
}
