package study;

import java.util.Scanner;

public class study_010 {
	
	public static void main(String[] args) {
		int i, min = 100, max = 0, hap = 0;
		int [] j = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력"); 
		for(i=0; i<5; i=i+1) {
			j[i] = sc.nextInt();
		}
		for(i=0; i<5; i=i+1) {
			if(j[i] < min) min = j[i];
			if(j[i] > max) max = j[i];
		}
		
		hap = max + min; 
		System.out.println("최대값 : " + max + "최소값 : " + min);
		System.out.println("최대 최소값의 합 : " + hap);
		
		sc.close();
	}
}
