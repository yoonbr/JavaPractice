package java1023;

import java.util.Arrays;
import java.util.Comparator;
// Coffee 클래스의 데이터를 비교하는 클래스
// Comparator 인터페이스를 구현

class ComparatorImpl implements Comparator<Coffee> {
	
	@Override
	public int compare(Coffee o1, Coffee o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
}

public class ArraySort {

	public static void main(String[] args) {
		// coffee 데이터 5개를 저장할 수 있는 공간을 생성 
		// 5개 공간 각각에는 현재는 null이 저장되어있음 -> 멤버 데이터를 저장한 적이 없기때문 
		Coffee [] coffees = new Coffee[5];
		
		Coffee coffee1 = new Coffee();
		coffee1.setNum(1);
		coffee1.setDay("mon");
		coffee1.setName("Americano");
		coffee1.setShot(5);
		coffee1.setMl(571);
		coffee1.setCal(10.5);
		
		// coffees 배열에 coffee1 의 데이터를 만들어 
		// 0번 배열 데이터에 삽입 
		coffees[0] = coffee1;
		
		// new 이후가 인스턴스이기 때문에 이렇게 생성해도 됨 
		coffee1 = new Coffee();	
		coffee1.setNum(2);
		coffee1.setDay("tue");
		coffee1.setName("latte");
		coffee1.setShot(3);
		coffee1.setMl(355);
		coffee1.setCal(180.2);
		
		coffees[1] = coffee1;
		
		coffee1 = new Coffee();	
		coffee1.setNum(3);
		coffee1.setDay("wed");
		coffee1.setName("coldblew");
		coffee1.setShot(1);
		coffee1.setMl(478);
		coffee1.setCal(30.3);
		
		coffees[2] = coffee1;
		
		coffee1 = new Coffee();	
		coffee1.setNum(4);
		coffee1.setDay("thur");
		coffee1.setName("cafemocha");
		coffee1.setShot(2);
		coffee1.setMl(360);
		coffee1.setCal(184.7);
		
		coffees[3] = coffee1;
		
		coffee1 = new Coffee();	
		coffee1.setNum(5);
		coffee1.setDay("fri");
		coffee1.setName("dolchelatte");
		coffee1.setShot(4);
		coffee1.setMl(575);
		coffee1.setCal(230.1);
		
		coffees[4] = coffee1;
	
		// 모든 데이터 출력 
		// 배열은 항상 포문으로 빠른 열거 사용 
		
		for (Coffee m : coffees) {
			System.out.printf("%s\n", m);
		}
		
		Arrays.sort(coffees, new ComparatorImpl());
		System.out.printf("이름의 오름차순 정렬 \n");
		// 배열의 데이터를 전부 출력
		for(Coffee m : coffees) {
			System.out.printf("%s\n" ,m);
		}
		
		// anonymous class를 이용한 이름의 내림차순 정렬 
		System.out.printf("이름의 내림차순 정렬 \n");
		Arrays.sort(coffees, new Comparator<Coffee>() {

			@Override
			public int compare(Coffee o1, Coffee o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(
						o1.getName());
			}
		});

	}
}