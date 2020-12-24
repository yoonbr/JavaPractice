package study;

import java.util.Scanner;

public class study_009 {

	public static void main(String[] args) {
		int s = 0, min = 100;
		int [] j = new int[5];
		System.out.println("5개의 숫자 입력");
		Scanner sc = new Scanner(System.in);
		for(s=0; s<5; s=s+1) {
			j[s] = sc.nextInt();
		}
		for(int i=0; i<5; i=i+1) {
			if(j[i] < min) {
				min = j[i];
			}
		}
		System.out.println("최소값은: " + min);
	}
}
