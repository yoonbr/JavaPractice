package study;

import java.util.Scanner;

public class study_011 {

	public static void main(String[] args) {
		int s = 0, d, mok = 0, nmg;
		int [] b = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("십진수 입력");
		d = sc.nextInt();
		mok = (int)(d/2);
		do {
			nmg=d-mok*2;
			System.out.println("nmg: " + nmg + "mok: " + mok + " / ");
			s = s + 1;
			b[s] = nmg; 
			d = mok;
			mok = (int)(d/2);
		} while (mok != 0);
		nmg = d-mok*2;
		System.out.println("nmg: " + nmg + "\t" + "mok: " + mok + " / ");
		s = s + 1;
		b[s] = nmg;
		System.out.println("이진수 출력");
		for(int i=s; i>0; i=i-1) {
			System.out.print(" " + b[i]);
		}
		sc.close();
	}
}
