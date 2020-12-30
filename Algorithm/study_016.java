package study;

import java.util.Scanner;

public class study_016 {

	public static void main(String[] args) {
		int i, m=0, l=0, h=9, k;
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("값 입력");
		for(i=0; i<10; i=i+1) {
			a[i]=sc.nextInt();
		}
		System.out.println("찾을 값 입력");
		k=sc.nextInt();
		
		while(true){
			if(l>h) {
				System.out.println("찾는 값이 없습니다.");
				break;
			}else {
				m=(int)((l+h)/2);
				if(k == a[m]) {
					System.out.println("찾는 값 : " +a[m]);
					break;
				} else {
					if(k<a[m]) {
					} else {
						l=m+1;
					}
				}
			}
		}
	}
}
