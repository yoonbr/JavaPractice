package study;

import java.util.Scanner;

public class study_013 {

	public static void main(String[] args) {
		int cnt = 0;
		int [] b = new int [5];
		int [] g = new int [5];
		System.out.println("숫자 입력");
		Scanner sc = new Scanner(System.in);
		for(cnt=0; cnt<5; cnt=cnt+1) {
			b[cnt] = sc.nextInt();
			g[cnt] = b[cnt];
		}
		for(int i=0; i<cnt-1; i=i+1) {
			if(b[i] == b[i+1]) { 
				g[i+1]=0;
			} else {
				g[i+1]=1;
			}
		}
			System.out.println("Gray Code : ");
			for(int i=0; i<cnt; i=i+1) {
				System.out.print(g[i] + " ");
			}
	}
}
