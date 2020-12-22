package study;

import java.util.Scanner;

public class study_007 {

	public static void main(String[] args) {
		Double lcm = 0.0, gcm  = 0.0, nmg, Big, Small, a, b;
		
		System.out.println("2개의 숫자를 입력해주세요. : ");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		if(a >= b) {
			Big = a; Small = b;
		} else {
			Big = b; Small = a;
		}
		while (true) {
			nmg = (Big%Small);
			if(nmg == 0) {
				gcm = Small;
				lcm = ((a * b) / gcm);
				break;
			} else {
				Big =  Small;
				Small = nmg; 
			}
		}
			
			System.out.println("출력");
			System.out.println("최대 공약수 : " + gcm);
			System.out.println("최소 공배수 : " + lcm);
			
			sc.close();
	}
}
