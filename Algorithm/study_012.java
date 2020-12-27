package study;

import java.util.Scanner;

public class study_012 {

	public static void main(String[] args) {
		int min = 9, l = 0, m = 0;
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력");
		for(int i=0; i<5; i=i+1) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<5; i=i+1) {
			if(a[i]<3) {
				l=3-a[i];
			} else {
				l=a[i]-3;
			}
			 if (l<min) {
				min=l;
				m=a[i];
			}	
		}
		System.out.println("3에 가장 가까운 수 " + m);
	}
}
