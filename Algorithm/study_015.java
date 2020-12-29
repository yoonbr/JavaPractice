package study;

import java.util.Scanner;

public class study_015 {

	public static void main(String[] args) {
		int i, j, temp; 
		int a[] = new int[5]; 
		System.out.println("값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		for(i=0; i<5; i=i+1) {
			a[i] = sc.nextInt();
		}
		for(j=4; j>=0; j=j-1) {
			for(i=0; i<j; i=i+1) {
				if(a[i]>a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		System.out.println("정렬 후");
		for(i=0; i<5; i=i+1) {
			System.out.println(a[i] + " ");
		}
	}
}
