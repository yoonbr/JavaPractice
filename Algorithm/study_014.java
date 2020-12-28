package study;

import java.util.Scanner;

public class study_014 {

	public static void main(String[] args) {
		int i, j;
		int [] jumsu = new int[5];
		int [] rank = new int[5];
		System.out.println("점수 입력");
		
		Scanner sc = new Scanner(System.in);
		for(i=0; i<5; i=i+1) {
			jumsu[i] = sc.nextInt();
			rank[i] = 1;
		}
		for(i=0; i<5; i=i+1) {
			for(j=0; j<5; j=j+1) {
				if(jumsu[i] < jumsu[j]) {
					rank[i] = rank[i] + 1;
				}
			}
		}
		System.out.println("점수 석차"); 
		for(i=0; i<5; i=i+1) {
			System.out.println(jumsu[i] + " : " + rank[i]); 
		}
		sc.close();
	}
}
